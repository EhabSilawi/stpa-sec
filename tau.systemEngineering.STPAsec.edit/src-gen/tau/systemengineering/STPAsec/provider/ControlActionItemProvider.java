/**
 */
package tau.systemengineering.STPAsec.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import tau.systemengineering.STPAsec.ControlAction;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * This is the item provider adapter for a {@link tau.systemengineering.STPAsec.ControlAction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlActionItemProvider extends ControlStructureElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlActionItemProvider(AdapterFactory adapterFactory) {
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

			addControllerSendersPropertyDescriptor(object);
			addControllerReceiversPropertyDescriptor(object);
			addControledProccessReceiversPropertyDescriptor(object);
			addSubsystemSendersPropertyDescriptor(object);
			addSubsystemReceiversPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Controller Senders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControllerSendersPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ControlAction_controllerSenders_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ControlAction_controllerSenders_feature",
								"_UI_ControlAction_type"),
						STPAsecPackage.Literals.CONTROL_ACTION__CONTROLLER_SENDERS, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Controller Receivers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControllerReceiversPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ControlAction_controllerReceivers_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ControlAction_controllerReceivers_feature",
								"_UI_ControlAction_type"),
						STPAsecPackage.Literals.CONTROL_ACTION__CONTROLLER_RECEIVERS, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Controled Proccess Receivers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControledProccessReceiversPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ControlAction_controledProccessReceivers_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ControlAction_controledProccessReceivers_feature",
						"_UI_ControlAction_type"),
				STPAsecPackage.Literals.CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVERS, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Subsystem Senders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubsystemSendersPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ControlAction_subsystemSenders_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ControlAction_subsystemSenders_feature",
								"_UI_ControlAction_type"),
						STPAsecPackage.Literals.CONTROL_ACTION__SUBSYSTEM_SENDERS, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Subsystem Receivers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubsystemReceiversPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ControlAction_subsystemReceivers_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ControlAction_subsystemReceivers_feature",
								"_UI_ControlAction_type"),
						STPAsecPackage.Literals.CONTROL_ACTION__SUBSYSTEM_RECEIVERS, true, false, true, null, null,
						null));
	}

	/**
	 * This returns ControlAction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ControlAction"));
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
		String label = ((ControlAction) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ControlAction_type")
				: getString("_UI_ControlAction_type") + " " + label;
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
	}

}
