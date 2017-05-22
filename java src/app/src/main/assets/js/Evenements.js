/**
 * Created by pierr_000 on 20/05/2017.
 */
class Evenements{
    constructor(){
        function resetAction(){
            actionEnCours = false;
        }

        $("#cree-compte").on("click", function(){
            if(!actionEnCours){
                actionEnCours = true;
                Materialize.toast(enDev, 4000, '', function () {
                    resetAction()
                });
            }
        });


        $("#connexion").on("click", function () {

            function updateInfoPersonne() {
                $("#idJou").val(unJoueur.idJou);
                $("#pseudoJou").val(unJoueur.pseudoJou);
                $("#prenomJou").val(unJoueur.prenomJou);
                $("#nomJou").val(unJoueur.nomJou);
                $("#emailJou").val(unJoueur.emailJou);

                $("#connexion-ecran").hide();
                $("#joueur-ecran").show();
            }

            if(!actionEnCours){
                var pseudo, password, json, unJoueur;

                pseudo = $("#pseudo").val();
                password = $("#password").val();

                json = Android.getJsonJoueur(pseudo, password);

               $.ajax({
                    type: 'POST',
                    url: 'http://192.168.1.29/TLPB-co/Joueur-test.php',
                    data: {json:json},

                    success: function (data) {
                            console.log("Réussite connexion");
                            var jsonPerson = data;
                            console.log("Json récupéré : " + jsonPerson);
                            unJoueur = JSON.parse(jsonPerson);
                            console.log(unJoueur);
                    },

                    error: function (resultat, statut, erreur) {
                        console.log("Resultat ", resultat);
                        console.log("Statut ", statut);
                        console.log("Erreur ", erreur);
                    }
                });




                actionEnCours = true;
                $("#loader").show();
                $("#loader-connexion").addClass("active");
                Materialize.toast("Connexion en cours...", 3000, '', function(){
                    Materialize.toast("Terminé", 1000, '', function(){
                        resetAction();
                        $("#loader-connexion").removeClass("active");
                        $("#loader").hide(100);
                        updateInfoPersonne();
                    });
                });
            }
        });
    }
}