/**
 */
package tau.systemengineering.STPAsec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tau.systemengineering.STPAsec.InsecureControlAction;
import tau.systemengineering.STPAsec.Loss;
import tau.systemengineering.STPAsec.STPAsecPackage;
import tau.systemengineering.STPAsec.SystemLevelConstraint;
import tau.systemengineering.STPAsec.SystemLevelHazard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Level Hazard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemLevelHazardImpl#getRefineHazards <em>Refine Hazards</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemLevelHazardImpl#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemLevelHazardImpl#getLeadsTo <em>Leads To</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemLevelHazardImpl#getUnsecureCondition <em>Unsecure Condition</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemLevelHazardImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemLevelHazardImpl#getSystem <em>System</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemLevelHazardImpl#getICA <em>ICA</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemLevelHazardImpl extends MinimalEObjectImpl.Container implements SystemLevelHazard {
	/**
	 * The cached value of the '{@link #getRefineHazards() <em>Refine Hazards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefineHazards()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemLevelHazard> refineHazards;

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
	 * The cached value of the '{@link #getLeadsTo() <em>Leads To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeadsTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Loss> leadsTo;

	/**
	 * The default value of the '{@link #getUnsecureCondition() <em>Unsecure Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsecureCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String UNSECURE_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnsecureCondition() <em>Unsecure Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsecureCondition()
	 * @generated
	 * @ordered
	 */
	protected String unsecureCondition = UNSECURE_CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemLevelConstraint> constraint;

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
	 * The cached value of the '{@link #getICA() <em>ICA</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getICA()
	 * @generated
	 * @ordered
	 */
	protected EList<InsecureControlAction> ica;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemLevelHazardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.SYSTEM_LEVEL_HAZARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemLevelHazard> getRefineHazards() {
		if (refineHazards == null) {
			refineHazards = new EObjectContainmentEList<SystemLevelHazard>(SystemLevelHazard.class, this,
					STPAsecPackage.SYSTEM_LEVEL_HAZARD__REFINE_HAZARDS);
		}
		return refineHazards;
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
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.SYSTEM_LEVEL_HAZARD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Loss> getLeadsTo() {
		if (leadsTo == null) {
			leadsTo = new EObjectWithInverseResolvingEList.ManyInverse<Loss>(Loss.class, this,
					STPAsecPackage.SYSTEM_LEVEL_HAZARD__LEADS_TO, STPAsecPackage.LOSS__TRACEABLE_TO);
		}
		return leadsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnsecureCondition() {
		return unsecureCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsecureCondition(String newUnsecureCondition) {
		String oldUnsecureCondition = unsecureCondition;
		unsecureCondition = newUnsecureCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.SYSTEM_LEVEL_HAZARD__UNSECURE_CONDITION, oldUnsecureCondition, unsecureCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemLevelConstraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectWithInverseResolvingEList.ManyInverse<SystemLevelConstraint>(
					SystemLevelConstraint.class, this, STPAsecPackage.SYSTEM_LEVEL_HAZARD__CONSTRAINT,
					STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__TRACEABLE_TO);
		}
		return constraint;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.SYSTEM_LEVEL_HAZARD__SYSTEM, oldSystem, system));
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
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.SYSTEM_LEVEL_HAZARD__SYSTEM, oldSystem,
					system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsecureControlAction> getICA() {
		if (ica == null) {
			ica = new EObjectWithInverseResolvingEList.ManyInverse<InsecureControlAction>(InsecureControlAction.class,
					this, STPAsecPackage.SYSTEM_LEVEL_HAZARD__ICA,
					STPAsecPackage.INSECURE_CONTROL_ACTION__LINK_TO_HAZRD);
		}
		return ica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__LEADS_TO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLeadsTo()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__CONSTRAINT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConstraint()).basicAdd(otherEnd, msgs);
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__ICA:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getICA()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__REFINE_HAZARDS:
			return ((InternalEList<?>) getRefineHazards()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__LEADS_TO:
			return ((InternalEList<?>) getLeadsTo()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__CONSTRAINT:
			return ((InternalEList<?>) getConstraint()).basicRemove(otherEnd, msgs);
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__ICA:
			return ((InternalEList<?>) getICA()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__REFINE_HAZARDS:
			return getRefineHazards();
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__ID:
			return getId();
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__LEADS_TO:
			return getLeadsTo();
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__UNSECURE_CONDITION:
			return getUnsecureCondition();
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__CONSTRAINT:
			return getConstraint();
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__SYSTEM:
			if (resolve)
				return getSystem();
			return basicGetSystem();
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__ICA:
			return getICA();
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
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__REFINE_HAZARDS:
			getRefineHazards().clear();
			getRefineHazards().addAll((Collection<? extends SystemLevelHazard>) newValue);
			return;
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__ID:
			setId((Integer) newValue);
			return;
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__LEADS_TO:
			getLeadsTo().clear();
			getLeadsTo().addAll((Collection<? extends Loss>) newValue);
			return;
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__UNSECURE_CONDITION:
			setUnsecureCondition((String) newValue);
			return;
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__CONSTRAINT:
			getConstraint().clear();
			getConstraint().addAll((Collection<? extends SystemLevelConstraint>) newValue);
			return;
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__SYSTEM:
			setSystem((tau.systemengineering.STPAsec.System) newValue);
			return;
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__ICA:
			getICA().clear();
			getICA().addAll((Collection<? extends InsecureControlAction>) newValue);
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
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__REFINE_HAZARDS:
			getRefineHazards().clear();
			return;
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__ID:
			setId(ID_EDEFAULT);
			return;
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__LEADS_TO:
			getLeadsTo().clear();
			return;
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__UNSECURE_CONDITION:
			setUnsecureCondition(UNSECURE_CONDITION_EDEFAULT);
			return;
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__CONSTRAINT:
			getConstraint().clear();
			return;
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__SYSTEM:
			setSystem((tau.systemengineering.STPAsec.System) null);
			return;
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__ICA:
			getICA().clear();
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
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__REFINE_HAZARDS:
			return refineHazards != null && !refineHazards.isEmpty();
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__ID:
			return id != ID_EDEFAULT;
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__LEADS_TO:
			return leadsTo != null && !leadsTo.isEmpty();
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__UNSECURE_CONDITION:
			return UNSECURE_CONDITION_EDEFAULT == null ? unsecureCondition != null
					: !UNSECURE_CONDITION_EDEFAULT.equals(unsecureCondition);
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__CONSTRAINT:
			return constraint != null && !constraint.isEmpty();
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__SYSTEM:
			return system != null;
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD__ICA:
			return ica != null && !ica.isEmpty();
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
		result.append(", unsecureCondition: ");
		result.append(unsecureCondition);
		result.append(')');
		return result.toString();
	}

} //SystemLevelHazardImpl
