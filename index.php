
<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="UTF-8">
  <title>My Closet</title>
  <link rel="stylesheet" href="style.css">
  <link rel="stylesheet" href="style_1.css">
  <link rel="stylesheet" href="slick.css">
  <style>div{padding: 10px;font-size:16px;}</style>
</head>
<body>

<!-- Head[Start] -->
<header>

  
  <h1 class = "title">My Closet</h1>



<div id ="main">
<div class="slider">
  <p>
  <img src="https://cdn.fashionsnap.com/collection/assets_c/2017/08/kanata-1011AW_01-thumb-467x700-729196.jpg?1549889833952" alt="">
  </p>
  <p>
  <img src="https://cdn.fashionsnap.com/collection/assets_c/2017/08/kanata-1011AW_05-thumb-467x700-729200.jpg" alt="">
  </p>
  <p>
  <img src="https://cdn.fashionsnap.com/collection/assets_c/2017/08/kanata-1011AW_13-thumb-220xauto-729208.jpg" alt="">
  </p>
  <p>
  <img src="https://cdn.fashionsnap.com/collection/assets_c/2017/08/kanata-1011AW_21-thumb-467x700-729216.jpg?1550146392393" alt="">
  </p>
  
</div>
</div>

</header>
<!-- Head[End] -->


<!-- Main[Start] -->
<!-- ここでinsert.phpにデータを送っている -->
<form method="post" action="insert.php" enctype="multipart/form-data"> 
  <div class="jumbotron">
   <fieldset>
    <legend>洋服登録</legend>
     <label>カテゴリー名：<input type="text" name="name" size="30" placeholder="ex.アウター、ボトムなど"></label><br>
     <label>ブランド名：<input type="text" name="brand" size="30" placeholder="ex.ユニクロ"></label><br>
     <label>商品価格：<input type="text" name="price" size="10" placeholder="ex.10000"></label><br>
     <label>色：<input type="text" name="color" size="10" placeholder="ex.ブラック"></label><br>
     <label>画像登録：<input type="file" name="upfile"></label><br>
     <input type="submit" name="submit1" value="登録">
     <input type="submit" name="submit2" value="連続登録">
    </fieldset>
  </div>
</form>
<!-- Main[End] -->

<footer>
 
<nav class="navbar navbar-default">
    <div class="container-fluid">
    <div class="navbar-header"><a class="navbar-brand" href="select.php">closet一覧</a></div>
    </div>
  </nav>

</footer>



<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="slick.min.js"></script> <!-- 順番大事 -->
<script src = index.js></script>




</body>
</html>

