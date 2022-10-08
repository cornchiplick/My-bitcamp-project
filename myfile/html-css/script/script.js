$(function(){

  // header menu
  $('header nav > ul').mouseenter(function(){
    $('ul.lv2, .headerBg').stop().slideDown()
  })

  $('header nav > ul').mouseleave(function(){
    $('ul.lv2, .headerBg').stop().slideUp()
  })

  // slide
  setInterval(function(){
    $('.slideWrap').animate({'margin-left':'-100%'},function(){
      $('.slide:first').appendTo('.slideWrap')
      $('.slideWrap').css({'margin-left':'0%'})
    })
  },3000)

  // popUpBox
  $('.notice li:nth-child(1)').click(function(){
    $('.popUpBox, .popUpBg').show()
  })
  $('.popUpBox button').click(function(){
      $('.popUpBox, .popUpBg').hide()
  })

})