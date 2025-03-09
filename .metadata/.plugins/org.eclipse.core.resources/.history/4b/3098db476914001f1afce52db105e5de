/**
 */
package robot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robot.CallFunction;
import robot.Expression;
import robot.FunctionIdentifier;
import robot.RobotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.impl.CallFunctionImpl#getFunctionidentifier <em>Functionidentifier</em>}</li>
 *   <li>{@link robot.impl.CallFunctionImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallFunctionImpl extends ExpressionImpl implements CallFunction {
	/**
	 * The cached value of the '{@link #getFunctionidentifier() <em>Functionidentifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionidentifier()
	 * @generated
	 * @ordered
	 */
	protected FunctionIdentifier functionidentifier;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.CALL_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionIdentifier getFunctionidentifier() {
		if (functionidentifier != null && functionidentifier.eIsProxy()) {
			InternalEObject oldFunctionidentifier = (InternalEObject) functionidentifier;
			functionidentifier = (FunctionIdentifier) eResolveProxy(oldFunctionidentifier);
			if (functionidentifier != oldFunctionidentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RobotPackage.CALL_FUNCTION__FUNCTIONIDENTIFIER, oldFunctionidentifier, functionidentifier));
			}
		}
		return functionidentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionIdentifier basicGetFunctionidentifier() {
		return functionidentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionidentifier(FunctionIdentifier newFunctionidentifier) {
		FunctionIdentifier oldFunctionidentifier = functionidentifier;
		functionidentifier = newFunctionidentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotPackage.CALL_FUNCTION__FUNCTIONIDENTIFIER,
					oldFunctionidentifier, functionidentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Expression>(Expression.class, this,
					RobotPackage.CALL_FUNCTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotPackage.CALL_FUNCTION__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RobotPackage.CALL_FUNCTION__FUNCTIONIDENTIFIER:
			if (resolve)
				return getFunctionidentifier();
			return basicGetFunctionidentifier();
		case RobotPackage.CALL_FUNCTION__PARAMETERS:
			return getParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RobotPackage.CALL_FUNCTION__FUNCTIONIDENTIFIER:
			setFunctionidentifier((FunctionIdentifier) newValue);
			return;
		case RobotPackage.CALL_FUNCTION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Expression>) newValue);
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
		case RobotPackage.CALL_FUNCTION__FUNCTIONIDENTIFIER:
			setFunctionidentifier((FunctionIdentifier) null);
			return;
		case RobotPackage.CALL_FUNCTION__PARAMETERS:
			getParameters().clear();
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
		case RobotPackage.CALL_FUNCTION__FUNCTIONIDENTIFIER:
			return functionidentifier != null;
		case RobotPackage.CALL_FUNCTION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallFunctionImpl
