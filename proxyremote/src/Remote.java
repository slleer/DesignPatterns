public class Remote implements IRemote {
	public int volume;
	public int channel;
	public int maxChannel;
	public int minChannel;
	
	public Remote() {
		this.volume = 10;
		this.channel = 6;
		this.maxChannel = 100;
		this.minChannel = 1;
	}
	public void volumeUp() {
		System.out.print("Increasing the volume from " + this.volume);
		this.volume += 1;
		System.out.println(" to " + this.volume);
	}
	public void volumeDown() {
		System.out.print("Decreasing the volume from " + this.volume);
		this.volume -= 1;
		System.out.println(" to " + this.volume);
	}
	public void channelUp() {
		System.out.print("Changing channel from " + this.channel);
		if(this.channel < this.maxChannel) {
			this.channel += 1;
		}
		else {
			System.out.print(" rolling over ");
			this.channel = minChannel;
		}
		System.out.println(" to " + this.channel);
	}
	public void channelDown() {
		System.out.print("Changing channel from " + this.channel);
		if(this.channel > this.minChannel) {
			this.channel -= 1;
		}
		else {
			System.out.print(" rolling over ");
			this.channel = this.maxChannel;
		}
		System.out.println(" to " + this.channel);
	}
}