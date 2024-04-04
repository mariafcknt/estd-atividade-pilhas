import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Aluno[] alunos = new Aluno[20];

        PE PE_1 = new PE();
        PE PE_2 = new PE();

        //Input do usuário
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno " + (i+1));
            System.out.print("Nome do aluno(a): ");
            String nome = scanner.nextLine();
            System.out.print("Sexo(M/F): ");
            char sexo = scanner.nextLine().charAt(0);
            System.out.println();

            alunos[i] = new Aluno(nome, i + 1, sexo);
        }

        // Popular as pilhas com os alunos
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].getSexo() == 'F') {
                PE_1.push(alunos[i]);
            } else {
                PE_2.push(alunos[i]);
            }
        }

        // TESTES DAS FUNÇÕES DO TAD PE
        /*
         * Teste da função isFull()
         * for (int i = 0; i < 10; i++) {
         * Aluno aluna = new Aluno("Aluna" + (i + 1), i + 1, 'F');
         * PE_1.push(aluna);
         * }
         * System.out.println(PE_1.isFull());
         * /*
         * 
         * /*
         * Teste da função destroy()
         * PE_1.destroy();
         * System.out.println(PE_1.isEmpty());
         */

        /*
         * Teste da função topo()
         * System.out.println(PE_2.topo());
         */

        // Desempilhar as pilhas
        while (!PE_1.isEmpty()) {
            Aluno alunoRemovido = PE_1.pop();
            System.out.println("Desempilhado: " + alunoRemovido.getNome() + ", Matrícula: "
                    + alunoRemovido.getMatricula() + ", Sexo: " + alunoRemovido.getSexo());
        }

        while (!PE_2.isEmpty()) {
            Aluno alunoRemovido = PE_2.pop();
            System.out.println("Desempilhado: " + alunoRemovido.getNome() + ", Matrícula: "
                    + alunoRemovido.getMatricula() + ", Sexo: " + alunoRemovido.getSexo());
        }
    }
}