/**
 */
package tau.systemengineering.STPAsec.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import tau.systemengineering.STPAsec.InsecureControlAction;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * This is the item provider adapter for a {@link tau.systemengineering.STPAsec.InsecureControlAction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InsecureControlActionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsecureControlActionItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addContextPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addLinkToHazrdPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addControlActionPropertyDescriptor(object);
			addCmdflowPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InsecureControlAction_type_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InsecureControlAction_type_feature",
						"_UI_InsecureControlAction_type"),
				STPAsecPackage.Literals.INSECURE_CONTROL_ACTION__TYPE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InsecureControlAction_context_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InsecureControlAction_context_feature",
						"_UI_InsecureControlAction_type"),
				STPAsecPackage.Literals.INSECURE_CONTROL_ACTION__CONTEXT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InsecureControlAction_source_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InsecureControlAction_source_feature",
								"_UI_InsecureControlAction_type"),
						STPAsecPackage.Literals.INSECURE_CONTROL_ACTION__SOURCE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Link To Hazrd feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkToHazrdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InsecureControlAction_linkToHazrd_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InsecureControlAction_linkToHazrd_feature",
						"_UI_InsecureControlAction_type"),
				STPAsecPackage.Literals.INSECURE_CONTROL_ACTION__LINK_TO_HAZRD, true, false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_InsecureControlAction_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InsecureControlAction_id_feature",
								"_UI_InsecureControlAction_type"),
						STPAsecPackage.Literals.INSECURE_CONTROL_ACTION__ID, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Control Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControlActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InsecureControlAction_controlAction_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InsecureControlAction_controlAction_feature",
						"_UI_InsecureControlAction_type"),
				STPAsecPackage.Literals.INSECURE_CONTROL_ACTION__CONTROL_ACTION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Cmdflow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCmdflowPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InsecureControlAction_cmdflow_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InsecureControlAction_cmdflow_feature",
								"_UI_InsecureControlAction_type"),
						STPAsecPackage.Literals.INSECURE_CONTROL_ACTION__CMDFLOW, true, false, true, null, null, null));
	}

	/**
	 * This returns InsecureControlAction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InsecureControlAction"));
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
		InsecureControlAction insecureControlAction = (InsecureControlAction) object;
		return getString("_UI_InsecureControlAction_type") + " " + insecureControlAction.getId();
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

		switch (notification.getFeatureID(InsecureControlAction.class)) {
		case STPAsecPackage.INSECURE_CONTROL_ACTION__TYPE:
		case STPAsecPackage.INSECURE_CONTROL_ACTION__CONTEXT:
		case STPAsecPackage.INSECURE_CONTROL_ACTION__ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
