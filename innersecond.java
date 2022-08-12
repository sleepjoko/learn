class Innersecond extends third{
    static{
        newbe = 0;
    }
    Innersecond(){
        super(0);
    }
    public static Integer newbe;
    public static void newdo(){
        if (newbe==0){
            System.out.println("yes");
            return;
        }
        newdo();
    }
}