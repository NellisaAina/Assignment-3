
public abstract class TypeOfMakeup {
	
String lipstick, eyeshadow, mascara, blusher;
    
    public void setMakeup(String newLipstick, String newEyeshadow, String newMascara, String newBlusher){
        lipstick = newLipstick;
        eyeshadow = newEyeshadow;
        mascara = newMascara;
        blusher = newBlusher;
    }
    
    public String getLipstick(){
        return lipstick;
    }
    
    public String getEyeshadow(){
        return eyeshadow;
    }
    
    public String getMascara(){
        return mascara;
    }
    
    public String getBlusher(){
        return blusher;
    }
    
    void HowToUse(){
        System.out.println("How to use this item: ");
    }
    
    void WhereToBuy(){
        System.out.println("You can find this item at: ");
    }

}
