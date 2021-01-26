package iostream.coffee;

public abstract class Decorator extends Coffee{
	
	//coffee���ڰ� �߿�
	Coffee coffee;
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public void brewing() {
		coffee.brewing();
	}
}
