package DigitalEmisora;

public class SintonizadorEmisorasFM {
	private float MHz;

    public float getMHz() {
        return MHz;
    }

    public void setMHz(int MHz) {
        this.MHz = MHz;
    }
    
    public float up(){
        MHz += 0.5;
        return MHz;
    }
    
    public float down(){
        MHz -= 0.5;
        return MHz;
    }
    
    public float display(){
        return MHz;
    }
    
    public float controlador(){
        if(MHz < 80){
            return MHz = 108;
        }
        else if (MHz > 108){
            return MHz = 80;
        }
        else{
            return MHz;
        }
    }

}
