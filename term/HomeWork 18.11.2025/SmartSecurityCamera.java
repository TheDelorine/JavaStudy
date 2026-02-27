public class SmartSecurityCamera extends SmartDevice {
	private boolean isRecording;
	private boolean motionDetection;
	private String videoQuality;

	public SmartSecurityCamera(boolean isRecording, boolean motionDetection) {
		super();
		this.isRecording = isRecording;
		this.motionDetection = motionDetection;
		this.videoQuality = videoQuality; 
	}

	public String getDeviceType() {
		return "Умная камера";
	}

	public void performAction() {
		if (isRecording == false) {
			System.out.println("Начинаю запись");
			isRecording = true;
		} else {
			System.out.println("Заканчиваю запись");
			isRecording = false;
		}
	}

	public void startRecording() {
		isRecording = true;
	}

	public void startRecording(boolean motionDetection) {
		this.motionDetection = motionDetection;
		isRecording = true;
	}

	public void detectMotion() {
		if (motionDetection == true) {
			System.out.println("Движение обнаружено!");
		} else {
			System.out.println("Движение не может быть обнаружено, так как функция обнурежия отключена!");
		}
	}
	public void getLiveFeed() {
		System.out.println("Ввывел Live трансляцию на ваш экран!");
	}
} 