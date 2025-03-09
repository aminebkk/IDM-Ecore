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

import robot.Condition;
import robot.RobotFactory;
import robot.RobotPackage;

/**
 * This is the item provider adapter for a {@link robot.Condition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionItemProvider extends StructureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(RobotPackage.Literals.CONDITION__THEN);
			childrenFeatures.add(RobotPackage.Literals.CONDITION__ELSE);
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
	 * This returns Condition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Condition"));
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
		return getString("_UI_Condition_type");
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

		switch (notification.getFeatureID(Condition.class)) {
		case RobotPackage.CONDITION__THEN:
		case RobotPackage.CONDITION__ELSE:
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

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(
				createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createForward()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createClock()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CONDITION__THEN,
				RobotFactory.eINSTANCE.createCallFunction()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createVar()));

		newChildDescriptors.add(
				createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createCallVar()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createConst()));

		newChildDescriptors.add(
				createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createEquals()));

		newChildDescriptors.add(
				createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add(
				createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createLesser()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createAdd()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createMinus()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createMul()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add(
				createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createDistance()));

		newChildDescriptors.add(
				createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createBackward()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createLeft()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createRight()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CONDITION__THEN,
				RobotFactory.eINSTANCE.createDistanceSensor()));

		newChildDescriptors.add(
				createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createTimeSensor()));

		newChildDescriptors.add(
				createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createCondition()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createLoop()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createOR()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createAND()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createNOT()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createTRUE()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__THEN, RobotFactory.eINSTANCE.createFALSE()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(
				createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createForward()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createClock()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CONDITION__ELSE,
				RobotFactory.eINSTANCE.createCallFunction()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createVar()));

		newChildDescriptors.add(
				createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createCallVar()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createConst()));

		newChildDescriptors.add(
				createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createEquals()));

		newChildDescriptors.add(
				createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add(
				createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createLesser()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createAdd()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createMinus()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createMul()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add(
				createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createDistance()));

		newChildDescriptors.add(
				createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createBackward()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createLeft()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createRight()));

		newChildDescriptors.add(createChildParameter(RobotPackage.Literals.CONDITION__ELSE,
				RobotFactory.eINSTANCE.createDistanceSensor()));

		newChildDescriptors.add(
				createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createTimeSensor()));

		newChildDescriptors.add(
				createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createCondition()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createLoop()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createOR()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createAND()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createNOT()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createTRUE()));

		newChildDescriptors
				.add(createChildParameter(RobotPackage.Literals.CONDITION__ELSE, RobotFactory.eINSTANCE.createFALSE()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == RobotPackage.Literals.STRUCTURE__CONDITION
				|| childFeature == RobotPackage.Literals.CONDITION__THEN
				|| childFeature == RobotPackage.Literals.CONDITION__ELSE;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
