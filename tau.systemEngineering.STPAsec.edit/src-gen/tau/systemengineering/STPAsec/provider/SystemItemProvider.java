/**
 */
package tau.systemengineering.STPAsec.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import tau.systemengineering.STPAsec.STPAsecFactory;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * This is the item provider adapter for a {@link tau.systemengineering.STPAsec.System} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
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

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addGoalPropertyDescriptor(object);
			addReceivesInfoPropertyDescriptor(object);
			addSendsInfoPropertyDescriptor(object);
			addReceivesFeedbackPropertyDescriptor(object);
			addSendsFeedbackPropertyDescriptor(object);
			addControlsPropertyDescriptor(object);
			addPerformsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_System_Id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_System_Id_feature", "_UI_System_type"),
						STPAsecPackage.Literals.SYSTEM__ID, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_System_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_System_name_feature", "_UI_System_type"),
						STPAsecPackage.Literals.SYSTEM__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Goal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_System_goal_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_System_goal_feature", "_UI_System_type"),
						STPAsecPackage.Literals.SYSTEM__GOAL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Receives Info feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReceivesInfoPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_System_receivesInfo_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_System_receivesInfo_feature",
								"_UI_System_type"),
						STPAsecPackage.Literals.SYSTEM__RECEIVES_INFO, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Sends Info feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSendsInfoPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_System_sendsInfo_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_System_sendsInfo_feature",
								"_UI_System_type"),
						STPAsecPackage.Literals.SYSTEM__SENDS_INFO, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Receives Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReceivesFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_System_receivesFeedback_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_System_receivesFeedback_feature",
								"_UI_System_type"),
						STPAsecPackage.Literals.SYSTEM__RECEIVES_FEEDBACK, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Sends Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSendsFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_System_sendsFeedback_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_System_sendsFeedback_feature",
								"_UI_System_type"),
						STPAsecPackage.Literals.SYSTEM__SENDS_FEEDBACK, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Controls feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControlsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_System_controls_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_System_controls_feature",
								"_UI_System_type"),
						STPAsecPackage.Literals.SYSTEM__CONTROLS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Performs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerformsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_System_performs_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_System_performs_feature",
								"_UI_System_type"),
						STPAsecPackage.Literals.SYSTEM__PERFORMS, true, false, true, null, null, null));
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
			childrenFeatures.add(STPAsecPackage.Literals.SYSTEM__CONTRO_ACTION);
			childrenFeatures.add(STPAsecPackage.Literals.SYSTEM__FEEDBACK);
			childrenFeatures.add(STPAsecPackage.Literals.SYSTEM__CONTROL_LOOP);
			childrenFeatures.add(STPAsecPackage.Literals.SYSTEM__SUB_SYSTEM);
			childrenFeatures.add(STPAsecPackage.Literals.SYSTEM__INFORMATION);
			childrenFeatures.add(STPAsecPackage.Literals.SYSTEM__CONTROLLER_CONSTRAINTS);
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
		case STPAsecPackage.SYSTEM__ID:
		case STPAsecPackage.SYSTEM__NAME:
		case STPAsecPackage.SYSTEM__GOAL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case STPAsecPackage.SYSTEM__CONTRO_ACTION:
		case STPAsecPackage.SYSTEM__FEEDBACK:
		case STPAsecPackage.SYSTEM__CONTROL_LOOP:
		case STPAsecPackage.SYSTEM__SUB_SYSTEM:
		case STPAsecPackage.SYSTEM__INFORMATION:
		case STPAsecPackage.SYSTEM__CONTROLLER_CONSTRAINTS:
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

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.SYSTEM__CONTRO_ACTION,
				STPAsecFactory.eINSTANCE.createControlAction()));

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.SYSTEM__FEEDBACK,
				STPAsecFactory.eINSTANCE.createFeedback()));

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.SYSTEM__CONTROL_LOOP,
				STPAsecFactory.eINSTANCE.createControlLoop()));

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.SYSTEM__SUB_SYSTEM,
				STPAsecFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.SYSTEM__INFORMATION,
				STPAsecFactory.eINSTANCE.createInformation()));

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.SYSTEM__CONTROLLER_CONSTRAINTS,
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
