public class Loop {
    public void odd(){
        for(int i=1;i<=20;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        Loop obj1 = new Loop();
        obj1.odd();
    }
}

    
