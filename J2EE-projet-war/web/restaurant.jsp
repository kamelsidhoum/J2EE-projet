<%
	String titre = "Le Crous de Dauphine";
	boolean afficherHeader = true;
	boolean afficherFooter = true;
	String fichierCSS = ""; //Ne PAS ajouter le .js, UNIQUEMENT le NOM DU FICHIER
	String fichierJS = ""; //Ne PAS ajouter le .js, UNIQUEMENT le NOM DU FICHIER
%>
<jsp:include page="include/header.jsp"></jsp:include>

		<main>
			<h1>Le CROUS de Dauphine</h1>
			<aside class="aside-img">
				<img class="img-openable" src="https://faceagroup.com/media/references/Restaurant%20CROUS%20Dauphine.jpg">
				<img class="img-openable" src="https://faceagroup.com/media/references/Cuisines%20CROUS.jpg">
				<i class="fas fa-arrow-circle-down" title="Voir plus de photos"></i>
				<img class="img-openable" src="http://www.beguin-macchini.com/wp-content/uploads/2015/06/MG_0089.jpg">
			</aside>
			<article>
				<p style="margin: 0; text-align: right; font-size: 0; float: right; margin-left: 50px;">
					<span class="star-rate">
						<i class="fas fa-star"></i>
						<i class="fas fa-star-half-alt"></i>
						<i class="far fa-star"></i>
						<i class="far fa-star"></i>
						<i class="far fa-star"></i>
					</span>
					<span style="display: inline-block; vertical-align: middle; font-size: 15px; margin-left: 10px;">
						<b style="font-size: 30px; font-weight: 600; color: #000;">1,5</b>/5
					</span>
					<span style="display: block; font-size: 14px; color: #aaa;">4 avis</span>
				</p>
				<p class="categories-list">
					<span>Haute gastronomie de qualité</span>
					<span>Produits du terroir</span>
					<span>Fait maison</span>
					<span>Végétarien</span>
				</p>
				<p>
					Place du Maréchal de Lattre de Tassigny<br>
					75016 Paris
				</p>
				<div style="margin: 15px 5px;">
					<p style="font-size: 16px;"><a href="tel:+33101010101"><i class="fas fa-phone fa-flip-horizontal" style="margin-right: 5px;"></i><span style="color: #000;">+33 1 01 01 01 01</span></a></p>
					<p style="font-size: 16px;"><a href="mailto:crous@dauphine.fr"><i class="fas fa-comment-alt" style="margin-right: 5px;"></i><span style="color: #000;">crous@dauphine.fr</span></a></p>
				</div>
				<div style="background-color: #f4f4f4; padding: 20px 10px; border-radius: 3px;">
				<h2 style="border-bottom: 1px solid #00bfa5; padding-bottom: 5px;">Quelques mots sur le restaurant</h2>
				<p style="line-height: 22px; margin-bottom: 0;">
					Le CROUS de l'Université Paris Dauphine vous accueille tous les midis (et même le samedi, eh oui on chôme pas nous!) afin de déguster des plats savoureux préparés par nos chefs en cuisine.
				</p>
			</div>
				<div style="background-color: #fff; border: 1px solid #e4e4e4; border-top: 0; border-radius: 0 0 3px 3px; padding: 10px; margin: 20px 0 10px;">
					<ul class="tab-nav">
						<li show="annonces">Annonces</li>
						<li show="menu" class="active">Menu</li>
						<li show="avis">Avis</li>
					</ul>
					<div id="annonces-tab" style="display: none;">
						<p>Annonces écrites par le restaurateur............</p>
					</div>
					<div id="menu-tab">
						<p>Menu du restaurant............</p>
						<p style="border-top: 1px solid #ddd; padding-top: 10px; margin-top: 10px; text-align: center; color: #aaa;">Les prix et les plats sont susceptibles de changer. Les prix affichés tiennent compte de la TVA.</p>
					</div>
					<div id="avis-tab"  style="display: none;">
						<p style="margin: 10px 0; font-size: 0; border-bottom: 1px solid #e4e4e4; text-align: center; padding-bottom: 10px;">
							<i class="fas fa-users" style="font-size: 50px; margin-right: 10px; display: inline-block; vertical-align: middle; width: 70px;"></i>
							<span style="display: inline-block; vertical-align: middle; width: calc(350px - 80px); font-size: 15px; text-align: left;">Retrouvez ici les avis des clients ayant été dans ce restaurant après avoir réservé une table via The Spoon.</span>
						</p>
						<label for="avis-input">Vous avez été au restaurant Le CROUS de Dauphine ?</label>
						<textarea id="avis-input" placeholder="Écrivez votre avis..." style="resize: none; width: 100%; padding: 0; border: 0; background-color: #fff; font-family: inherit; font-size: 17px; color: #000; margin: 10px 0;"></textarea>
						<!--<label>Quelle note mettriez-vous à ce restaurant ?</label>
						<i class="fas fa-minus-circle" title="Diminuer la note"></i>
						<span class="star-rate">
							<i class="fas fa-star"></i>
							<i class="fas fa-star-half-alt"></i>
							<i class="far fa-star"></i>
							<i class="far fa-star"></i>
							<i class="far fa-star"></i>
						</span>
						<i class="fas fa-plus-circle" title="Augmenter la note"></i>
						<button>Envoyer</button>-->
					</div>
				</div>
			</article>
		</main>

<jsp:include page="include/footer.jsp"></jsp:include>
