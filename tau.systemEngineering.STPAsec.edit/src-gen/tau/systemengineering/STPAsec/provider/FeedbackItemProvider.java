/**
 */
package tau.systemengineering.STPAsec.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import tau.systemengineering.STPAsec.Feedback;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * This is the item provider adapter for a {@link tau.systemengineering.STPAsec.Feedback} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeedbackItemProvider extends ControlStructureElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackItemProvider(AdapterFactory adapterFactory) {
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
			addControledProcessReceiversPropertyDescriptor(object);
			addControledProcessSendersPropertyDescriptor(object);
			addSendsFeedbacksPropertyDescriptor(object);
			addReceiversFeedbacksPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_Feedback_controllerSenders_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Feedback_controllerSenders_feature",
								"_UI_Feedback_type"),
						STPAsecPackage.Literals.FEEDBACK__CONTROLLER_SENDERS, true, false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_Feedback_controllerReceivers_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Feedback_controllerReceivers_feature",
								"_UI_Feedback_type"),
						STPAsecPackage.Literals.FEEDBACK__CONTROLLER_RECEIVERS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Controled Process Receivers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControledProcessReceiversPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Feedback_controledProcessReceivers_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Feedback_controledProcessReceivers_feature",
						"_UI_Feedback_type"),
				STPAsecPackage.Literals.FEEDBACK__CONTROLED_PROCESS_RECEIVERS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Controled Process Senders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControledProcessSendersPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Feedback_controledProcessSenders_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Feedback_controledProcessSenders_feature",
								"_UI_Feedback_type"),
						STPAsecPackage.Literals.FEEDBACK__CONTROLED_PROCESS_SENDERS, true, false, true, null, null,
						null));
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
						getResourceLocator(), getString("_UI_Feedback_sendsFeedbacks_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Feedback_sendsFeedbacks_feature",
								"_UI_Feedback_type"),
						STPAsecPackage.Literals.FEEDBACK__SENDS_FEEDBACKS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Receivers Feedbacks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReceiversFeedbacksPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Feedback_receiversFeedbacks_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Feedback_receiversFeedbacks_feature",
								"_UI_Feedback_type"),
						STPAsecPackage.Literals.FEEDBACK__RECEIVERS_FEEDBACKS, true, false, true, null, null, null));
	}

	/**
	 * This returns Feedback.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Feedback"));
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
		String label = ((Feedback) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Feedback_type")
				: getString("_UI_Feedback_type") + " " + label;
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
