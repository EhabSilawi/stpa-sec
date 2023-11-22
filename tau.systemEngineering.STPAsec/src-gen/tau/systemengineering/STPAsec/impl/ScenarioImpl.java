/**
 */
package tau.systemengineering.STPAsec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import tau.systemengineering.STPAsec.InsecureControlAction;
import tau.systemengineering.STPAsec.STPAsecPackage;
import tau.systemengineering.STPAsec.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ScenarioImpl#getICA <em>ICA</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ScenarioImpl#getSystem <em>System</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ScenarioImpl#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ScenarioImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The cached value of the '{@link #getICA() <em>ICA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getICA()
	 * @generated
	 * @ordered
	 */
	protected InsecureControlAction ica;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected tau.systemengineering.STPAsec.System system;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsecureControlAction getICA() {
		if (ica != null && ica.eIsProxy()) {
			InternalEObject oldICA = (InternalEObject) ica;
			ica = (InsecureControlAction) eResolveProxy(oldICA);
			if (ica != oldICA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, STPAsecPackage.SCENARIO__ICA, oldICA,
							ica));
			}
		}
		return ica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsecureControlAction basicGetICA() {
		return ica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setICA(InsecureControlAction newICA) {
		InsecureControlAction oldICA = ica;
		ica = newICA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.SCENARIO__ICA, oldICA, ica));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tau.systemengineering.STPAsec.System getSystem() {
		if (system != null && system.eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject) system;
			system = (tau.systemengineering.STPAsec.System) eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, STPAsecPackage.SCENARIO__SYSTEM,
							oldSystem, system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tau.systemengineering.STPAsec.System basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(tau.systemengineering.STPAsec.System newSystem) {
		tau.systemengineering.STPAsec.System oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.SCENARIO__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.SCENARIO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.SCENARIO__CONTEXT, oldContext,
					context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case STPAsecPackage.SCENARIO__ICA:
			if (resolve)
				return getICA();
			return basicGetICA();
		case STPAsecPackage.SCENARIO__SYSTEM:
			if (resolve)
				return getSystem();
			return basicGetSystem();
		case STPAsecPackage.SCENARIO__ID:
			return getId();
		case STPAsecPackage.SCENARIO__CONTEXT:
			return getContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case STPAsecPackage.SCENARIO__ICA:
			setICA((InsecureControlAction) newValue);
			return;
		case STPAsecPackage.SCENARIO__SYSTEM:
			setSystem((tau.systemengineering.STPAsec.System) newValue);
			return;
		case STPAsecPackage.SCENARIO__ID:
			setId((Integer) newValue);
			return;
		case STPAsecPackage.SCENARIO__CONTEXT:
			setContext((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case STPAsecPackage.SCENARIO__ICA:
			setICA((InsecureControlAction) null);
			return;
		case STPAsecPackage.SCENARIO__SYSTEM:
			setSystem((tau.systemengineering.STPAsec.System) null);
			return;
		case STPAsecPackage.SCENARIO__ID:
			setId(ID_EDEFAULT);
			return;
		case STPAsecPackage.SCENARIO__CONTEXT:
			setContext(CONTEXT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case STPAsecPackage.SCENARIO__ICA:
			return ica != null;
		case STPAsecPackage.SCENARIO__SYSTEM:
			return system != null;
		case STPAsecPackage.SCENARIO__ID:
			return id != ID_EDEFAULT;
		case STPAsecPackage.SCENARIO__CONTEXT:
			return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", context: ");
		result.append(context);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
