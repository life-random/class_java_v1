package design.templit;

public abstract class Harve {

    public abstract void prepare();
    public abstract void doing();
    public abstract void end();

    public final void run(){
     prepare();
     doing();
     end();
    }
}
