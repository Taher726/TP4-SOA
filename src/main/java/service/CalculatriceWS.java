package service;

//Ces trois lignes d'import dans le code correspondent à des déclarations d'importation de classes ou d'annotations spécifiques de l'API Jakarta Web Services (JWS).
//L'annotation @WebMethod est utilisée pour indiquer qu'une méthode Java doit être exposée en tant que méthode accessible via le service web.
// En d'autres termes, elle permet de définir une méthode comme une opération du service web.
import jakarta.jws.WebMethod;
//L'annotation @WebParam est utilisée pour annoter les paramètres d'une méthode exposée via un service web.
import jakarta.jws.WebParam;
// L'annotation @WebService est utilisée pour indiquer que la classe Java est un service web.
// Elle est placée au niveau de la classe qui contient les méthodes à exposer en tant qu'opérations du service web.
import jakarta.jws.WebService;

@WebService
//La classe est annotée avec l'annotation @WebService. Cette annotation indique que la classe est un service web qui expose des méthodes via JWS.
public class CalculatriceWS{
    @WebMethod
    //La classe contient une méthode somme annotée avec @WebMethod.
    // Cette annotation indique que la méthode somme sera exposée en tant que méthode accessible via le service web.
    //La méthode prend deux paramètres de type double, a et b, qui représentent les nombres à additionner.
    //Les paramètres a et b sont additionnés ensemble, et le résultat est renvoyé sous forme de double.
    public double somme(@WebParam double a, @WebParam double b){
        return a+b;
    }
}