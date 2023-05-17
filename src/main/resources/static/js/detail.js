
rec_navs = document.querySelectorAll('.rec_nav');

rec_navs.forEach((nav) => {
    nav.addEventListener('click', function(event){
        var navs = document.querySelectorAll('.rec_nav');
        for(var i=0;i<navs.length;i++){
            navs[i].classList.remove('active')
            console.log('===========')
            
        }
        event.target.className += ' active'
    })
})

// Slick Slider

$(document).ready(function(){
    // $('.autoplay').slick({
    //     slidesToShow: 3,
    //     slidesToScroll: 1,
    //     autoplay: true,
    //     autoplaySpeed: 2000,
    //   });

    $('.center').slick({
        centerMode: true,
        centerPadding: '60px',
        slidesToShow: 3,
        responsive: [
          {
            breakpoint: 768,
            settings: {
              arrows: false,
              centerMode: true,
              centerPadding: '40px',
              slidesToShow: 3
            }
          },
          {
            breakpoint: 480,
            settings: {
              arrows: false,
              centerMode: true,
              centerPadding: '40px',
              slidesToShow: 1
            }
          }
        ]
      });
})