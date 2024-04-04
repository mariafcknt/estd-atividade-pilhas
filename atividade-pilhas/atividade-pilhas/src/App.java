public class App {
    public static void main(String[] args) throws Exception {
        Aluno[] alunos = new Aluno[20];

        PE PE_1 = new PE(); 
        PE PE_2 = new PE();

        // Instância dos alunos
        alunos[0] = new Aluno("Ana", 1, 'F');
        alunos[1] = new Aluno("João", 2, 'M');
        alunos[2] = new Aluno("Maria", 3, 'F');
        alunos[3] = new Aluno("Pedro", 4, 'M');
        alunos[4] = new Aluno("Mariana", 5, 'F');
        alunos[5] = new Aluno("Lucas", 6, 'M');
        alunos[6] = new Aluno("Carla", 7, 'F');
        alunos[7] = new Aluno("Paulo", 8, 'M');
        alunos[8] = new Aluno("Gabriela", 9, 'F');
        alunos[9] = new Aluno("Rafael", 10, 'M');
        alunos[10] = new Aluno("Fernanda", 11, 'F');
        alunos[11] = new Aluno("Daniel", 12, 'M');
        alunos[12] = new Aluno("Patrícia", 13, 'F');
        alunos[13] = new Aluno("Gustavo", 14, 'M');
        alunos[14] = new Aluno("Aline", 15, 'F');
        alunos[15] = new Aluno("Bruno", 16, 'M');
        alunos[16] = new Aluno("Juliana", 17, 'F');
        alunos[17] = new Aluno("Marcelo", 18, 'M');
        alunos[18] = new Aluno("Camila", 19, 'F');
        alunos[19] = new Aluno("Felipe", 20, 'M');

        //for (int i = 0; alunos.lenght; i+=)

        //FAZER A LISTA COM O INPUT DO USUÁRIO


        // Popular as pilhas com os alunos
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].getSexo() == 'F') {
                PE_1.push(alunos[i]);
            } else {
                PE_2.push(alunos[i]);
            }
        }

        //TESTES DAS FUNÇÕES DO TAD PE
        /* Teste da função isFull()
        for (int i = 0; i < 10; i++) {
            Aluno aluna = new Aluno("Aluna" + (i + 1), i + 1, 'F');
            PE_1.push(aluna);
        }
        System.out.println(PE_1.isFull());
        /*

        /*
        Teste da função destroy()
        PE_1.destroy();
        System.out.println(PE_1.isEmpty());
        */

        /* Teste da função topo()
        System.out.println(PE_2.topo());
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