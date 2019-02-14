

// var  name ="小林郁瑠";
// console.log(name);


$(document).ready(function(){


$('.slider').slick({
    centerMode: true, //センターモード
    centerPadding: '60px', //前後のパディング
    autoplay: true, //オートプレイ
    autoplaySpeed: 2000, //オートプレイの切り替わり時間
    slidesToShow: 3, 
    swipeToSlide:true,
});
});

