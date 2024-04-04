public class PE {
    private Aluno[] PE; 
    private int topo;
    private int tamanho;

    public PE() { //init
        tamanho = 20; //quantidade de alunos na sala
        PE = new Aluno[tamanho];
        topo = -1;
    }

    public void destroy() {
        PE = null;
        topo = -1;
        tamanho = 0;
    }

    public void push(Aluno aluno){
        if (isFull()) {
            System.out.println("Pilha cheia, impossível adicionar");
        } else {
            topo++;
            PE[topo] = aluno;
        }
    }

    public Aluno pop() {
        Aluno alunoRemovido;
        alunoRemovido = PE[topo];
        topo--;
        return alunoRemovido;
    }

    public boolean isEmpty() {
        return (topo == -1);
    }

    public boolean isFull() {
        return (topo == 19);
    }

    public String topo() {
        return PE[topo].getNome();
    }

    public void printPilha() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        } else {
            System.out.println("Elementos da pilha PE_1:");
            for (int i = 0; i <= topo; i++) {
                System.out.println(PE[i].getNome());
            }
        }
    }
}