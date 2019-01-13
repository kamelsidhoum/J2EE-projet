$(document).ready(function() {

	//Barre de recherche du header :
	$('nav > input').focus(function(e) {
		$('#search-mask').fadeIn(50);
	}).blur(function(e) {
		$('#search-mask').fadeOut(50);
	}).keyup(function(e) {
		if ($(this).val().length == 0) {
			$('#search-mask ul').eq(0).slideUp(50);
		}
		else {
			$('#search-mask ul').eq(0).slideDown(50);
		}
		$('#search-mask i').text('pour « ' + $(this).val() + ' »'); //temporaire
	})/*.keyup()*/;

	//On masque les suggestions de recherche lorsque le focus était sur la barre de recherche alors qu'on a scrollé :
	$(window).scroll(function(e) {
		$('nav > input').blur();
	});

	//Barre d'onglets Annonces/Menu/Avis :
	$('.tab-nav li').click(function(e) {
		$('#' + $(this).parent().children('li.active').attr('show') + '-tab').slideUp(100);
		$('#' + $(this).attr('show') + '-tab').slideDown(100);
		$(this).parent().find('li.active').removeClass('active');
		$(this).addClass('active');
	});

	//Chargement des images supplémentaires :
	$('.aside-img > i').click(function(e) {
		for (var i = 0; i < 2; i++) {
			var $img = $('<img class="img-openable" src="" alt="Image supplémentaire" style="background: repeating-linear-gradient(-45deg, #ddd 0, #ddd 5px, #ccc 5px, #ccc 10px); height: 100px; font-size: 14px; border-color: #fafafa; display: none; color: #00bfa5; text-transform: uppercase; font-size: 16px; line-height: 16px; text-align: center; padding-top: 42px;">');
			$(this).parent().append($img);
		}
		$(this).parent().children('img:hidden').each(function(e) {
			$(this).slideDown(100);
		});
		$(this).remove();
	});

	$('#show-connexion-box').click(function(e) {
		e.preventDefault();
		$('#connexion-box').show();
		$('#box-mask').fadeIn(500);
		$('body').addClass('no-scroll');
	});

	$('#box-mask').click(function(e) {
		$(this).fadeOut(500);
		$('.box-content:visible').fadeOut(200);
		$('body').removeClass('no-scroll');
	});

});
