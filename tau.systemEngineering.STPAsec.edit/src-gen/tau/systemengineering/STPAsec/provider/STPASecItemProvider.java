/**
 */
package tau.systemengineering.STPAsec.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import tau.systemengineering.STPAsec.STPASec;
import tau.systemengineering.STPAsec.STPAsecFactory;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * This is the item provider adapter for a {@link tau.systemengineering.STPAsec.STPASec} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class STPASecItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STPASecItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(STPAsecPackage.Literals.STPA_SEC__SYSTEM);
			childrenFeatures.add(STPAsecPackage.Literals.STPA_SEC__LOSS);
			childrenFeatures.add(STPAsecPackage.Literals.STPA_SEC__SYSTEM_LEVEL_HAZARD);
			childrenFeatures.add(STPAsecPackage.Literals.STPA_SEC__SYSTEM_LEVEL_CONSTRAINT);
			childrenFeatures.add(STPAsecPackage.Literals.STPA_SEC__SCENARIO);
			childrenFeatures.add(STPAsecPackage.Literals.STPA_SEC__INSECURE_CONTROL_ACTION);
			childrenFeatures.add(STPAsecPackage.Literals.STPA_SEC__CONTROLLER_CONSTRAINTS);
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
	 * This returns STPASec.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/STPASec"));
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
		return getString("_UI_STPASec_type");
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

		switch (notification.getFeatureID(STPASec.class)) {
		case STPAsecPackage.STPA_SEC__SYSTEM:
		case STPAsecPackage.STPA_SEC__LOSS:
		case STPAsecPackage.STPA_SEC__SYSTEM_LEVEL_HAZARD:
		case STPAsecPackage.STPA_SEC__SYSTEM_LEVEL_CONSTRAINT:
		case STPAsecPackage.STPA_SEC__SCENARIO:
		case STPAsecPackage.STPA_SEC__INSECURE_CONTROL_ACTION:
		case STPAsecPackage.STPA_SEC__CONTROLLER_CONSTRAINTS:
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

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.STPA_SEC__SYSTEM,
				STPAsecFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add(
				createChildParameter(STPAsecPackage.Literals.STPA_SEC__LOSS, STPAsecFactory.eINSTANCE.createLoss()));

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.STPA_SEC__SYSTEM_LEVEL_HAZARD,
				STPAsecFactory.eINSTANCE.createSystemLevelHazard()));

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.STPA_SEC__SYSTEM_LEVEL_CONSTRAINT,
				STPAsecFactory.eINSTANCE.createSystemLevelConstraint()));

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.STPA_SEC__SCENARIO,
				STPAsecFactory.eINSTANCE.createScenario()));

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.STPA_SEC__INSECURE_CONTROL_ACTION,
				STPAsecFactory.eINSTANCE.createInsecureControlAction()));

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.STPA_SEC__CONTROLLER_CONSTRAINTS,
				STPAsecFactory.eINSTANCE.createControllerConstraints()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return STPAsecEditPlugin.INSTANCE;
	}

}
