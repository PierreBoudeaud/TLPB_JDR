/**
 * Created by pierr_000 on 20/05/2017.
 */
class Evenements{
    constructor(){
        $("#cree-compte").on("click", function(){
            if(!actionEnCours){
                actionEnCours = true;
                Materialize.toast(enDev, 4000, '', function () {
                    actionEnCours = false;
                    Android.hello();
                    var json = Android.getJsonJoueur("deltadu17", "dui480");
                    $("#test").html(json);
                });
            }
        });


        $("#connexion").on("click", function () {
            if(!actionEnCours){
                actionEnCours = true;
                $("#loader").show();
                $("#loader-connexion").addClass("active");
                Materialize.toast("Connexion en cours...", 5000, '', function(){
                    Materialize.toast("Terminé", 2000, '', function(){
                        actionEnCours = false;
                        $("#loader-connexion").removeClass("active");
                        $("#loader").hide(100);
                    });
                });
            }
        });
    }
}