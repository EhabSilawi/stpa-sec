/**
 */
package tau.systemengineering.STPAsec.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import tau.systemengineering.STPAsec.STPAsecFactory;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * This is the item provider adapter for a {@link tau.systemengineering.STPAsec.System} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemItemProvider extends ControllerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(STPAsecPackage.Literals.SYSTEM__RECOMMENDS);
			childrenFeatures.add(STPAsecPackage.Literals.SYSTEM__GOALS);
			childrenFeatures.add(STPAsecPackage.Literals.SYSTEM__SCENARIO);
			childrenFeatures.add(STPAsecPackage.Literals.SYSTEM__CONSISTS_OF);
			childrenFeatures.add(STPAsecPackage.Literals.SYSTEM__POTENTIAL_HAZARDS);
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
	 * This returns System.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/System"));
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
		String label = ((tau.systemengineering.STPAsec.System) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_System_type")
				: getString("_UI_System_type") + " " + label;
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

		switch (notification.getFeatureID(tau.systemengineering.STPAsec.System.class)) {
		case STPAsecPackage.SYSTEM__RECOMMENDS:
		case STPAsecPackage.SYSTEM__GOALS:
		case STPAsecPackage.SYSTEM__SCENARIO:
		case STPAsecPackage.SYSTEM__CONSISTS_OF:
		case STPAsecPackage.SYSTEM__POTENTIAL_HAZARDS:
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

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.SYSTEM__RECOMMENDS,
				STPAsecFactory.eINSTANCE.createSecurityRecommendation()));

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.SYSTEM__GOALS,
				STPAsecFactory.eINSTANCE.createMissionGoal()));

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.SYSTEM__SCENARIO,
				STPAsecFactory.eINSTANCE.createLossScenario()));

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.SYSTEM__CONSISTS_OF,
				STPAsecFactory.eINSTANCE.createControlStructure()));

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.SYSTEM__POTENTIAL_HAZARDS,
				STPAsecFactory.eINSTANCE.createHazard()));
	}

}
