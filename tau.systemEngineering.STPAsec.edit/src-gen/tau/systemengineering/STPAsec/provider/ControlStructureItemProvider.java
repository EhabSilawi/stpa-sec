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

import tau.systemengineering.STPAsec.ControlStructure;
import tau.systemengineering.STPAsec.STPAsecFactory;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * This is the item provider adapter for a {@link tau.systemengineering.STPAsec.ControlStructure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlStructureItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlStructureItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addModelGoalPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addSendsFeedbacksPropertyDescriptor(object);
			addSendsCommandsPropertyDescriptor(object);
			addControllerSendsInfoPropertyDescriptor(object);
			addControllerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						getResourceLocator(), getString("_UI_ControlStructure_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ControlStructure_name_feature",
								"_UI_ControlStructure_type"),
						STPAsecPackage.Literals.CONTROL_STRUCTURE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Model Goal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelGoalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ControlStructure_modelGoal_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ControlStructure_modelGoal_feature",
								"_UI_ControlStructure_type"),
						STPAsecPackage.Literals.CONTROL_STRUCTURE__MODEL_GOAL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ControlStructure_description_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ControlStructure_description_feature",
								"_UI_ControlStructure_type"),
						STPAsecPackage.Literals.CONTROL_STRUCTURE__DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sends Feedbacks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSendsFeedbacksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ControlStructure_sendsFeedbacks_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ControlStructure_sendsFeedbacks_feature",
						"_UI_ControlStructure_type"),
				STPAsecPackage.Literals.CONTROL_STRUCTURE__SENDS_FEEDBACKS, true, false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_ControlStructure_sendsCommands_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ControlStructure_sendsCommands_feature",
								"_UI_ControlStructure_type"),
						STPAsecPackage.Literals.CONTROL_STRUCTURE__SENDS_COMMANDS, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Controller Sends Info feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControllerSendsInfoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ControlStructure_controllerSendsInfo_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ControlStructure_controllerSendsInfo_feature",
						"_UI_ControlStructure_type"),
				STPAsecPackage.Literals.CONTROL_STRUCTURE__CONTROLLER_SENDS_INFO, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Controller feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControllerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ControlStructure_controller_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ControlStructure_controller_feature",
								"_UI_ControlStructure_type"),
						STPAsecPackage.Literals.CONTROL_STRUCTURE__CONTROLLER, true, false, true, null, null, null));
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
			childrenFeatures.add(STPAsecPackage.Literals.CONTROL_STRUCTURE__CONTROLLEDPROCESS);
			childrenFeatures.add(STPAsecPackage.Literals.CONTROL_STRUCTURE__CONTROLACTION);
			childrenFeatures.add(STPAsecPackage.Literals.CONTROL_STRUCTURE__FEEDBACK);
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
	 * This returns ControlStructure.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ControlStructure"));
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
		String label = ((ControlStructure) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ControlStructure_type")
				: getString("_UI_ControlStructure_type") + " " + label;
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

		switch (notification.getFeatureID(ControlStructure.class)) {
		case STPAsecPackage.CONTROL_STRUCTURE__NAME:
		case STPAsecPackage.CONTROL_STRUCTURE__MODEL_GOAL:
		case STPAsecPackage.CONTROL_STRUCTURE__DESCRIPTION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLLEDPROCESS:
		case STPAsecPackage.CONTROL_STRUCTURE__CONTROLACTION:
		case STPAsecPackage.CONTROL_STRUCTURE__FEEDBACK:
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

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.CONTROL_STRUCTURE__CONTROLLEDPROCESS,
				STPAsecFactory.eINSTANCE.createControlledProcess()));

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.CONTROL_STRUCTURE__CONTROLACTION,
				STPAsecFactory.eINSTANCE.createControlAction()));

		newChildDescriptors.add(createChildParameter(STPAsecPackage.Literals.CONTROL_STRUCTURE__FEEDBACK,
				STPAsecFactory.eINSTANCE.createFeedback()));
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
