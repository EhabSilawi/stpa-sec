/**
 */
package tau.systemengineering.STPAsec.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import tau.systemengineering.STPAsec.util.STPAsecAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class STPAsecItemProviderAdapterFactory extends STPAsecAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STPAsecItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link tau.systemengineering.STPAsec.LossScenario} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LossScenarioItemProvider lossScenarioItemProvider;

	/**
	 * This creates an adapter for a {@link tau.systemengineering.STPAsec.LossScenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLossScenarioAdapter() {
		if (lossScenarioItemProvider == null) {
			lossScenarioItemProvider = new LossScenarioItemProvider(this);
		}

		return lossScenarioItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tau.systemengineering.STPAsec.Hazard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardItemProvider hazardItemProvider;

	/**
	 * This creates an adapter for a {@link tau.systemengineering.STPAsec.Hazard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHazardAdapter() {
		if (hazardItemProvider == null) {
			hazardItemProvider = new HazardItemProvider(this);
		}

		return hazardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tau.systemengineering.STPAsec.MissionGoal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionGoalItemProvider missionGoalItemProvider;

	/**
	 * This creates an adapter for a {@link tau.systemengineering.STPAsec.MissionGoal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMissionGoalAdapter() {
		if (missionGoalItemProvider == null) {
			missionGoalItemProvider = new MissionGoalItemProvider(this);
		}

		return missionGoalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tau.systemengineering.STPAsec.SecurityRecomendation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityRecomendationItemProvider securityRecomendationItemProvider;

	/**
	 * This creates an adapter for a {@link tau.systemengineering.STPAsec.SecurityRecomendation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecurityRecomendationAdapter() {
		if (securityRecomendationItemProvider == null) {
			securityRecomendationItemProvider = new SecurityRecomendationItemProvider(this);
		}

		return securityRecomendationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tau.systemengineering.STPAsec.System} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemItemProvider systemItemProvider;

	/**
	 * This creates an adapter for a {@link tau.systemengineering.STPAsec.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemAdapter() {
		if (systemItemProvider == null) {
			systemItemProvider = new SystemItemProvider(this);
		}

		return systemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tau.systemengineering.STPAsec.STPASec} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected STPASecItemProvider stpaSecItemProvider;

	/**
	 * This creates an adapter for a {@link tau.systemengineering.STPAsec.STPASec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSTPASecAdapter() {
		if (stpaSecItemProvider == null) {
			stpaSecItemProvider = new STPASecItemProvider(this);
		}

		return stpaSecItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tau.systemengineering.STPAsec.Feedback} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackItemProvider feedbackItemProvider;

	/**
	 * This creates an adapter for a {@link tau.systemengineering.STPAsec.Feedback}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeedbackAdapter() {
		if (feedbackItemProvider == null) {
			feedbackItemProvider = new FeedbackItemProvider(this);
		}

		return feedbackItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tau.systemengineering.STPAsec.ControlledProcess} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlledProcessItemProvider controlledProcessItemProvider;

	/**
	 * This creates an adapter for a {@link tau.systemengineering.STPAsec.ControlledProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlledProcessAdapter() {
		if (controlledProcessItemProvider == null) {
			controlledProcessItemProvider = new ControlledProcessItemProvider(this);
		}

		return controlledProcessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tau.systemengineering.STPAsec.Controller} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerItemProvider controllerItemProvider;

	/**
	 * This creates an adapter for a {@link tau.systemengineering.STPAsec.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControllerAdapter() {
		if (controllerItemProvider == null) {
			controllerItemProvider = new ControllerItemProvider(this);
		}

		return controllerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tau.systemengineering.STPAsec.ControlStructure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlStructureItemProvider controlStructureItemProvider;

	/**
	 * This creates an adapter for a {@link tau.systemengineering.STPAsec.ControlStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlStructureAdapter() {
		if (controlStructureItemProvider == null) {
			controlStructureItemProvider = new ControlStructureItemProvider(this);
		}

		return controlStructureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tau.systemengineering.STPAsec.ControlAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlActionItemProvider controlActionItemProvider;

	/**
	 * This creates an adapter for a {@link tau.systemengineering.STPAsec.ControlAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlActionAdapter() {
		if (controlActionItemProvider == null) {
			controlActionItemProvider = new ControlActionItemProvider(this);
		}

		return controlActionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (lossScenarioItemProvider != null)
			lossScenarioItemProvider.dispose();
		if (hazardItemProvider != null)
			hazardItemProvider.dispose();
		if (missionGoalItemProvider != null)
			missionGoalItemProvider.dispose();
		if (securityRecomendationItemProvider != null)
			securityRecomendationItemProvider.dispose();
		if (systemItemProvider != null)
			systemItemProvider.dispose();
		if (stpaSecItemProvider != null)
			stpaSecItemProvider.dispose();
		if (feedbackItemProvider != null)
			feedbackItemProvider.dispose();
		if (controlledProcessItemProvider != null)
			controlledProcessItemProvider.dispose();
		if (controllerItemProvider != null)
			controllerItemProvider.dispose();
		if (controlStructureItemProvider != null)
			controlStructureItemProvider.dispose();
		if (controlActionItemProvider != null)
			controlActionItemProvider.dispose();
	}

}
