/**
 */
package robot.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import robot.BinaryExpression;
import robot.RobotFactory;
import robot.RobotPackage;

/**
 * This is the item provider adapter for a {@link robot.BinaryExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryExpressionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpressionItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION);
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
	 * This returns BinaryExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BinaryExpression"));
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
		return getString("_UI_BinaryExpression_type");
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

		switch (notification.getFeatureID(BinaryExpression.class)) {
		case RobotPackage.BINARY_EXPRESSION__EXPRESSION:
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

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION,
				RobotFactory.eINSTANCE.createCallFunction()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION,
				RobotFactory.eINSTANCE.createCallVar()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION,
				RobotFactory.eINSTANCE.createConst()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION,
				RobotFactory.eINSTANCE.createEquals()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION,
				RobotFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION,
				RobotFactory.eINSTANCE.createLesser()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION,
				RobotFactory.eINSTANCE.createAdd()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION,
				RobotFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION,
				RobotFactory.eINSTANCE.createMul()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION,
				RobotFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION,
				RobotFactory.eINSTANCE.createDistance()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION,
				RobotFactory.eINSTANCE.createDistanceSensor()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION,
				RobotFactory.eINSTANCE.createTimeSensor()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION,
				RobotFactory.eINSTANCE.createOR()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION,
				RobotFactory.eINSTANCE.createAND()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION,
				RobotFactory.eINSTANCE.createNOT()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION,
				RobotFactory.eINSTANCE.createTRUE()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.BINARY_EXPRESSION__EXPRESSION,
				RobotFactory.eINSTANCE.createFALSE()));
	}

}
