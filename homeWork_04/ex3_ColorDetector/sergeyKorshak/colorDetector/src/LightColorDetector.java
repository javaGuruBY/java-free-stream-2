public class LightColorDetector {
    public String detect(int wavelenght){
        if(wavelenght>=380 & wavelenght<=449){
            return ("Violet");
        }
        else if(wavelenght>=450 & wavelenght<=494){
            return ("Blue");
        }
        else if(wavelenght>=495 & wavelenght<=569){
            return ("Green");
        }
        else if(wavelenght>=570 & wavelenght<=589){
            return ("Yellow");
        }
        else if(wavelenght>=590 & wavelenght<=619){
            return ("Orange");
        }
        else if(wavelenght>=620 && wavelenght<=750){
            return ("Red");
        }
        else{
            return ("Invisible light");
        }

    }

}
