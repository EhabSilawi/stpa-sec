/**
 */
package tau.systemengineering.STPAsec.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import tau.systemengineering.STPAsec.Controller;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * This is the item provider adapter for a {@link tau.systemengineering.STPAsec.Controller} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControllerItemProvider extends ControlStructureElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerItemProvider(AdapterFactory adapterFactory) {
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

			addSendsFeedbacksPropertyDescriptor(object);
			addSendsCommandsPropertyDescriptor(object);
			addSendsInfoPropertyDescriptor(object);
			addReceivesInfoPropertyDescriptor(object);
			addReceivesFeedbacksPropertyDescriptor(object);
			addReceivesCommandsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sends Feedbacks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSendsFeedbacksPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Controller_sendsFeedbacks_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Controller_sendsFeedbacks_feature",
								"_UI_Controller_type"),
						STPAsecPackage.Literals.CONTROLLER__SENDS_FEEDBACKS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Sends Commands feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSendsCommandsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Controller_sendsCommands_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Controller_sendsCommands_feature",
								"_UI_Controller_type"),
						STPAsecPackage.Literals.CONTROLLER__SENDS_COMMANDS, true, false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_Controller_sendsInfo_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Controller_sendsInfo_feature",
								"_UI_Controller_type"),
						STPAsecPackage.Literals.CONTROLLER__SENDS_INFO, true, false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_Controller_receivesInfo_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Controller_receivesInfo_feature",
								"_UI_Controller_type"),
						STPAsecPackage.Literals.CONTROLLER__RECEIVES_INFO, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Receives Feedbacks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReceivesFeedbacksPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Controller_receivesFeedbacks_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Controller_receivesFeedbacks_feature",
								"_UI_Controller_type"),
						STPAsecPackage.Literals.CONTROLLER__RECEIVES_FEEDBACKS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Receives Commands feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReceivesCommandsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Controller_receivesCommands_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Controller_receivesCommands_feature",
								"_UI_Controller_type"),
						STPAsecPackage.Literals.CONTROLLER__RECEIVES_COMMANDS, true, false, true, null, null, null));
	}

	/**
	 * This returns Controller.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Controller"));
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
		String label = ((Controller) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Controller_type")
				: getString("_UI_Controller_type") + " " + label;
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
