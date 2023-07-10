package heroes;


public interface HeroInterface {
    public static int getHealth() { return 0; }
    public static void setHealth( int health ) { }
    public static void setState( int state ) { }
    public static void doDamage( int damage ) {
        setHealth( getHealth() - damage );
        if ( getHealth() <= 0 ) {
            setHealth( 0 );
            setState ( -1 );
        }
    }
}
