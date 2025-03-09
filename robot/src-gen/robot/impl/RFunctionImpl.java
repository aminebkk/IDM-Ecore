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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robot.Block;
import robot.FunctionIdentifier;
import robot.RFunction;
import robot.RobotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RFunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robot.impl.RFunctionImpl#getFunctionidentifier <em>Functionidentifier</em>}</li>
 *   <li>{@link robot.impl.RFunctionImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RFunctionImpl extends MinimalEObjectImpl.Container implements RFunction {
	/**
	 * The cached value of the '{@link #getFunctionidentifier() <em>Functionidentifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionidentifier()
	 * @generated
	 * @ordered
	 */
	protected FunctionIdentifier functionidentifier;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> block;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.RFUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionIdentifier getFunctionidentifier() {
		return functionidentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionidentifier(FunctionIdentifier newFunctionidentifier,
			NotificationChain msgs) {
		FunctionIdentifier oldFunctionidentifier = functionidentifier;
		functionidentifier = newFunctionidentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RobotPackage.RFUNCTION__FUNCTIONIDENTIFIER, oldFunctionidentifier, newFunctionidentifier);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionidentifier(FunctionIdentifier newFunctionidentifier) {
		if (newFunctionidentifier != functionidentifier) {
			NotificationChain msgs = null;
			if (functionidentifier != null)
				msgs = ((InternalEObject) functionidentifier).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RobotPackage.RFUNCTION__FUNCTIONIDENTIFIER, null, msgs);
			if (newFunctionidentifier != null)
				msgs = ((InternalEObject) newFunctionidentifier).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RobotPackage.RFUNCTION__FUNCTIONIDENTIFIER, null, msgs);
			msgs = basicSetFunctionidentifier(newFunctionidentifier, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotPackage.RFUNCTION__FUNCTIONIDENTIFIER,
					newFunctionidentifier, newFunctionidentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Block> getBlock() {
		if (block == null) {
			block = new EObjectContainmentEList<Block>(Block.class, this, RobotPackage.RFUNCTION__BLOCK);
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RobotPackage.RFUNCTION__FUNCTIONIDENTIFIER:
			return basicSetFunctionidentifier(null, msgs);
		case RobotPackage.RFUNCTION__BLOCK:
			return ((InternalEList<?>) getBlock()).basicRemove(otherEnd, msgs);
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
		case RobotPackage.RFUNCTION__FUNCTIONIDENTIFIER:
			return getFunctionidentifier();
		case RobotPackage.RFUNCTION__BLOCK:
			return getBlock();
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
		case RobotPackage.RFUNCTION__FUNCTIONIDENTIFIER:
			setFunctionidentifier((FunctionIdentifier) newValue);
			return;
		case RobotPackage.RFUNCTION__BLOCK:
			getBlock().clear();
			getBlock().addAll((Collection<? extends Block>) newValue);
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
		case RobotPackage.RFUNCTION__FUNCTIONIDENTIFIER:
			setFunctionidentifier((FunctionIdentifier) null);
			return;
		case RobotPackage.RFUNCTION__BLOCK:
			getBlock().clear();
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
		case RobotPackage.RFUNCTION__FUNCTIONIDENTIFIER:
			return functionidentifier != null;
		case RobotPackage.RFUNCTION__BLOCK:
			return block != null && !block.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RFunctionImpl
