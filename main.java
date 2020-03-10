package agenda;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class main{
    
    public static void main(final String[] args) {
        final Scanner teclado = new Scanner(System.in);
        final Agenda A1 = new Agenda();
        final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Informe a data no formato:(dd/MM/yyyy):");
        final String data = teclado.nextLine();
        sdf.setLenient(false);
        try{
            Date parse = sdf.parse(data);
            System.out.println("Anotações: ");
            A1.setAnotacoes(teclado.nextLine());
        }   
            catch (final ParseException e) {
            System.out.println("Ops... Data Inválida\n");
        }  
    }    
}


    

