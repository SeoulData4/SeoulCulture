$('.sitemap-btn').click(function() {
    $('.allmenu_m').css('display', 'block');
    $('.sitemap-btn').addClass('opened');
});


$('.close_m').click(function() {
    $('.allmenu_m').css('display', 'none');
    $('sitemap-btn').removeClass('opened');
})

$('.search-btn').click(function() {
    $('.searchArea').addClass('active');
})

$('.searchArea__close').click(function() {
    $('.searchArea').removeClass('active');
})

// $('.cate-first').click(function() {
//     $('cate-second').removeClass('active');
//     $('cate-third').removeClass('active');
//     $('cate-fourth').removeClass('active');
//     $('cate-first').addClass('active');
// })

// $('.cate-second').click(function() {
//     $('cate-first').removeClass('active');
//     $('cate-third').removeClass('active');
//     $('cate-fourth').removeClass('active');
//     $('cate-second').addClass('active');
// })

// $('.cate-third').click(function() {
//     $('cate-first').removeClass('active');
//     $('cate-second').removeClass('active');
//     $('cate-fourth').removeClass('active');
//     $('cate-third').addClass('active');
// })

// $('.cate-fourth').click(function() {
//     $('cate-first').removeClass('active');
//     $('cate-second').removeClass('active');
//     $('cate-third').removeClass('active');
//     $('cate-fourth').addClass('active');
// })