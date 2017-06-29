package stack_queue;

public class TowersOfHanoi {
	public static void move(int n, char from, char to, char aux){
		if(n == 1){
			System.out.println("Move disk from " + from + " to " + to);
			return ;
		}
		move(n - 1, from, aux, to);
		System.out.println("Move disk from " + from + " to " + to);
		move(n - 1, aux, to, from);
	}
	public static void main(String[] args) {
		move(2, 'A', 'B', 'C');
	}
}
