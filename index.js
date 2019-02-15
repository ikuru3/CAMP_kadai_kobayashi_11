

// var  name ="小林郁瑠";
// console.log(name);

$("#ikuru").css("border", "1px solid red");

$(document).ready(function(){


$('.slider').slick({
    centerMode: true, //センターモード
    centerPadding: '80px', //前後のパディング
    autoplay: true, //オートプレイ
    autoplaySpeed: 2000, //オートプレイの切り替わり時間
    slidesToShow: 5, 
    swipeToSlide:true,
});
});


