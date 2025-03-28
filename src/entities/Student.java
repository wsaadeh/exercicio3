package entities;

public class Student {
    public String name;
    public double[] notas;

    public double finalGrade(){
        double soma = 0.00;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma;
    }

    public double missingPoints(){
        double soma = finalGrade();

        if(soma <= 60.00){
            return  60.00 - soma;
        }else {
            return 0.00;
        }
    }

    public String toString(){
        double soma = finalGrade();
        if (soma > 60.00){
            return "Pass";
        }else{
            return "Failed";
        }
    }
}
