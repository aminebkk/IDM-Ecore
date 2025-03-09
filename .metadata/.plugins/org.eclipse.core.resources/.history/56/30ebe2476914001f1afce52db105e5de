/**
 */
package robot.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robot.RobotPackage;
import robot.TimeSensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.impl.TimeSensorImpl#getCurrentMillis <em>Current Millis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSensorImpl extends ExpressionImpl implements TimeSensor {
	/**
	 * The default value of the '{@link #getCurrentMillis() <em>Current Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMillis()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_MILLIS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentMillis() <em>Current Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMillis()
	 * @generated
	 * @ordered
	 */
	protected int currentMillis = CURRENT_MILLIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.TIME_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCurrentMillis() {
		return currentMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentMillis(int newCurrentMillis) {
		int oldCurrentMillis = currentMillis;
		currentMillis = newCurrentMillis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotPackage.TIME_SENSOR__CURRENT_MILLIS,
					oldCurrentMillis, currentMillis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RobotPackage.TIME_SENSOR__CURRENT_MILLIS:
			return getCurrentMillis();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RobotPackage.TIME_SENSOR__CURRENT_MILLIS:
			setCurrentMillis((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RobotPackage.TIME_SENSOR__CURRENT_MILLIS:
			setCurrentMillis(CURRENT_MILLIS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RobotPackage.TIME_SENSOR__CURRENT_MILLIS:
			return currentMillis != CURRENT_MILLIS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (CurrentMillis: ");
		result.append(currentMillis);
		result.append(')');
		return result.toString();
	}

} //TimeSensorImpl
