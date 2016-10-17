/**
 * Created by ramon on 17/10/16.
 */
public class Pokemon {

    public String nome;
    public String tipo;
    public int nivel;


    public boolean alterarNivel(int n){
        if(n <= 33 && n>this.nivel){
            this.nivel=n;
            return true;
        }else{
            return false;
        }

    }
    public boolean alterarNivel(){
        if (this.nivel<33){
            this.nivel++;
            return true;
        }else{
            return false;
        }

    }
}
