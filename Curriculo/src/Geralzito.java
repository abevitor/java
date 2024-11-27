public class Geralzito {

    public boolean Assalariar(GetSet a) {

        if(a.getSalario() >= 2500) {

            System.out.println("A expectativa de salário é muito alta. Oferecemos 2300.");
            return true;

        }

        if(a.getSalario() <=2300){

            System.out.println("Você está Contratado!");
            return false;

        }

        return true;
    }

    public boolean geral(GetSet a) {

        System.out.println(a.getNome());
        System.out.println(a.getIdade());
        System.out.println(a.getSalario());
        System.out.println(a.getCursando());
        System.out.println(a.getEscolaridade());
        System.out.println(a.getEmail());
        System.out.println(a.getGraduacao());
        return Assalariar(a);
    }
}
