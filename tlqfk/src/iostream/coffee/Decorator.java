package iostream.coffee;

public abstract class Decorator extends Coffee{
	
	//coffee인자가 중요
	Coffee coffee;
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public void brewing() {
		coffee.brewing();
	}
}
