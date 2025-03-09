/**
 */
package robot.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import robot.CallFunction;
import robot.RobotFactory;
import robot.RobotPackage;

/**
 * This is the item provider adapter for a {@link robot.CallFunction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CallFunctionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallFunctionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFunctionidentifierPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Functionidentifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionidentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CallFunction_functionidentifier_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CallFunction_functionidentifier_feature",
								"_UI_CallFunction_type"),
						RobotPackage.Literals.CALL_FUNCTION__FUNCTIONIDENTIFIER, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CallFunction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CallFunction"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_CallFunction_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CallFunction.class)) {
		case RobotPackage.CALL_FUNCTION__PARAMETERS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS,
				RobotFactory.eINSTANCE.createCallFunction()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS,
				RobotFactory.eINSTANCE.createCallVar()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS,
				RobotFactory.eINSTANCE.createConst()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS,
				RobotFactory.eINSTANCE.createEquals()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS,
				RobotFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS,
				RobotFactory.eINSTANCE.createLesser()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS,
				RobotFactory.eINSTANCE.createAdd()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS,
				RobotFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS,
				RobotFactory.eINSTANCE.createMul()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS,
				RobotFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS,
				RobotFactory.eINSTANCE.createDistance()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS,
				RobotFactory.eINSTANCE.createDistanceSensor()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS,
				RobotFactory.eINSTANCE.createTimeSensor()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS,
				RobotFactory.eINSTANCE.createOR()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS,
				RobotFactory.eINSTANCE.createAND()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS,
				RobotFactory.eINSTANCE.createNOT()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS,
				RobotFactory.eINSTANCE.createTRUE()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CALL_FUNCTION__PARAMETERS,
				RobotFactory.eINSTANCE.createFALSE()));
	}

}
