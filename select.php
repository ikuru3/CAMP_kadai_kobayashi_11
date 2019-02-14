<?php
//1.  DB接続します xxxにDB名を入れます
try {
$pdo = new PDO('mysql:dbname=c_db;charset=utf8;host=localhost','root','');
} catch (PDOException $e) {
  exit('データベースに接続できませんでした。'.$e->getMessage());
}

//２．データ登録SQL作成
//作ったテーブル名を書く場所  xxxにテーブル名を入れます
$stmt = $pdo->prepare("SELECT * FROM c_table");
$status = $stmt->execute();

//３．データ表示
$view="";
if($status==false){
  //execute（SQL実行時にエラーがある場合）
  $error = $stmt->errorInfo();
  exit("ErrorQuery:".$error[2]);
}else{
  //Selectデータの数だけ自動でループしてくれる $resultの中に「カラム名」が入ってくるのでそれを表示させる例
  while( $result = $stmt->fetch(PDO::FETCH_ASSOC)){
  
    $enc_img = base64_encode($result["image"]);
    
    try {
			//ここの@マークはエラーを出さないおまじないみたいなものなので一旦気にしないでください！
			$imginfo = @getimagesize('data:application/octet-stream;base64,' . $enc_img);
		} catch(Exception $e) {
			$imginfo = false;
    }


    $view .= '<div class ="result">';
    $view .= "<p>";
    $view .= '<div class ="multi">';
    $view .= "NO.".$result["id"];       $view .= "<br>";
    $view .= "カテゴリー：".$result["name"];       $view .= "<br>";
    $view .= "ブランド名：".$result["brand"];      $view .= "<br>";
    $view .= "商品価格：¥".$result["price"];  $view .= "<br>";
    $view .=  "色:".$result["color"];
    //base64の時はこれがいる!
    $view .= '<div class ="img">';
		if($imginfo){
      $view .= '<img src="data:' . $imginfo['mime'] . ';base64,'.$enc_img.'">';
    }
    
    $view .= '</div>';
    $view .= '</div>';
    $view .= "</p>";
    $view .= '</div>';
  }

}


?>


<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>My Items</title>
<link rel="stylesheet" href="style.css">
<style>div{padding: 10px;font-size:16px;}</style>
</head>
<body id="main">

<!-- Head[Start] -->
<header>
  <h1 class = title>My Items</h1>
   
</header>


<form action="" method="post">
       
       <p class = p2><input type="text" name="search" size="50" placeholder="ex.カテゴリー,ブランド,商品価格,色" ><br></p>
       <p class = p3><input type="submit" name="" value="キーワード検索"></p>
     </form>
     
    

<!-- Head[End] -->

<!-- Main[Start] $view-->
<div>
    <p class = p4><div class="container jumbotron"><?=$view?></div></p>
</div>




<!-- Main[End] -->

<footer>

<nav class="navbar navbar-default">
    <div class="container-fluid">
      <div class="navbar-header">
      <a class="navbar-brand" href="index.php">洋服登録画面に戻る</a>
      </div>
    </div>
  </nav>

</footer>


</body>
</html>

