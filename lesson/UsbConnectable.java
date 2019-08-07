public interface UsbConnectable{
	void UsbConnect();
}
class Mouse implements UsbConnectable{
	@Override
	public void UsbConnect(){
		System.out.print("USB");
	}
}
class Memory implements UsbConnectable{
	@Override
	public void UsbConnect(){
		System.out.print("USB");
	}
}
class CardReader implements UsbConnectable{
	@Override
	public void UsbConnect(){
		System.out.print("aaaa");
	}
}
class PC{
	private UsbConnectable device;
	public void execApp(){
        System.out.print("アプリケーションを実行する");
} 
    public void usb(){
          this.device.UsbConnect();
}
      public void setDevice(UsbConnectable device){
           this.device=device;
}
}
