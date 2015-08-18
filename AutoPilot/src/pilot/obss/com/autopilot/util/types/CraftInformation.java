package pilot.obss.com.autopilot.util.types;

import pilot.obss.com.autopilot.util.Mission;

public class CraftInformation {
	private static CraftInformation craftInformation;

	private float airSpeed;
	private GpsLocation gpsLocation;
	private Mission mission;
    private float heading;
    private float roll;
    private float pitch;
    private float rudder;
    private double pitchRate;
    private double rollRate;
    private double altitudeFt;
    private float verticalSpeed;
    private double rudderRate;
    private boolean rotateEnabled;

    private float motor1 = 1500;
    private float motor2 = 1500;
    private float motor3 = 1500;
    private float motor4 = 1500;

    private float aileron = 90;
    private float elevator = 90;

	private CraftInformation() {

	}

	public static CraftInformation getInstance() {
		if (craftInformation == null) {
			craftInformation = new CraftInformation();
		}
		return craftInformation;
	}

	public float getAirSpeed() {
		return airSpeed;
	}

	public void setAirSpeed(float airSpeed) {
		this.airSpeed = airSpeed;
	}

	public GpsLocation getGpsLocation() {
		return gpsLocation;
	}

	public void setGpsLocation(GpsLocation gpsLocation) {
		this.gpsLocation = gpsLocation;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	public Mission getMission() {
		return mission;
	}

    public float getHeading(){
        return heading;
    }

    public void setHeading(float heading){
        this.heading = heading;
    }

    public float getRoll(){
        return roll;
    }

    public void setRoll(float roll){
        this.roll = roll;
    }

    public float getPitch() {
        return pitch;
    }

    public void setPitch(float pitch) {
        this.pitch = pitch;
    }
    
    public float getRudder() {
		return heading;
	}

	public void setRudder(float rudder) {
		this.rudder = rudder;
	}
	
	public double getPitchRate() {
		return pitchRate;
	}

	public void setPitchRate(double pitchRate) {
		this.pitchRate = pitchRate;
	}
	
	public double getRudderRate() {
		return rudderRate;
	}

	public void setRudderRate(double rudderRate) {
		this.rudderRate = rudderRate;
	}

	public double getRollRate() {
		return rollRate;
	}

	public void setRollRate(double rollRate) {
		this.rollRate = rollRate;
	}

	public double getAltitudeFt() {
        return altitudeFt;
    }

    public void setAltitudeFt(double altitudeFt) {
        this.altitudeFt = altitudeFt;
    }

    public float getVerticalSpeed() {
        return verticalSpeed;
    }

    public void setVerticalSpeed(float verticalSpeed) {
        this.verticalSpeed = verticalSpeed;
    }

    public float getMotor1() {
        return motor1;
    }

    public void setMotor1(float motor1) {
//        this.motor1 = getPwmValue(motor1);
    	this.motor1 = motor1;
    }

    public float getMotor2() {
        return motor2;
    }

    public void setMotor2(float motor2) {
    	this.motor2 = motor2;
//        this.motor2 = getPwmValue(motor2);
    }

    public float getMotor3() {
        return motor3;
    }

    public void setMotor3(float motor3) {
    	this.motor3 = motor3;
//        this.motor3 = getPwmValue(motor3);
    }

    public float getMotor4() {
        return motor4;
    }

    public void setMotor4(float motor4) {
//        this.motor4 = getPwmValue(motor4);
    	this.motor4 = motor4;
    }

    public void setResetMotorLastSpeeds() {
        motor1 = 0;
        motor2 = 0;
        motor3 = 0;
        motor4 = 0;
    }

    private float getPwmValue(float motor) {
        if(motor > 1900){
            motor = 1900;
        }else if(motor < 1100) {
            motor = 1100;
        }
        return motor;
    }

    public void setAileron(float aileron){
        this.aileron = aileron;
    }

    public float getAileron(){
        return aileron;
    }

    public float getElevator() {
        return elevator;
    }

    public void setElevator(float elevator) {
        this.elevator = elevator;
    }

	public boolean isRotateEnabled() {
		return rotateEnabled;
	}

	public void setRotateEnabled(boolean rotateEnabled) {
		this.rotateEnabled = rotateEnabled;
	}
    
}
