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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tau.systemengineering.STPAsec.STPAsecPackage;
import tau.systemengineering.STPAsec.SystemLevelConstraint;
import tau.systemengineering.STPAsec.SystemLevelHazard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Level Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemLevelConstraintImpl#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemLevelConstraintImpl#getConditionToEnforce <em>Condition To Enforce</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemLevelConstraintImpl#getTraceableTo <em>Traceable To</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.SystemLevelConstraintImpl#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemLevelConstraintImpl extends MinimalEObjectImpl.Container implements SystemLevelConstraint {
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
	 * The default value of the '{@link #getConditionToEnforce() <em>Condition To Enforce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionToEnforce()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_TO_ENFORCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionToEnforce() <em>Condition To Enforce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionToEnforce()
	 * @generated
	 * @ordered
	 */
	protected String conditionToEnforce = CONDITION_TO_ENFORCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTraceableTo() <em>Traceable To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceableTo()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemLevelHazard> traceableTo;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemLevelConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.SYSTEM_LEVEL_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionToEnforce() {
		return conditionToEnforce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionToEnforce(String newConditionToEnforce) {
		String oldConditionToEnforce = conditionToEnforce;
		conditionToEnforce = newConditionToEnforce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__CONDITION_TO_ENFORCE, oldConditionToEnforce,
					conditionToEnforce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemLevelHazard> getTraceableTo() {
		if (traceableTo == null) {
			traceableTo = new EObjectWithInverseResolvingEList.ManyInverse<SystemLevelHazard>(SystemLevelHazard.class,
					this, STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__TRACEABLE_TO,
					STPAsecPackage.SYSTEM_LEVEL_HAZARD__CONSTRAINT);
		}
		return traceableTo;
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
							STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__SYSTEM, oldSystem, system));
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
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__SYSTEM,
					oldSystem, system));
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
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__TRACEABLE_TO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTraceableTo()).basicAdd(otherEnd, msgs);
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
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__TRACEABLE_TO:
			return ((InternalEList<?>) getTraceableTo()).basicRemove(otherEnd, msgs);
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
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__ID:
			return getId();
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__CONDITION_TO_ENFORCE:
			return getConditionToEnforce();
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__TRACEABLE_TO:
			return getTraceableTo();
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__SYSTEM:
			if (resolve)
				return getSystem();
			return basicGetSystem();
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
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__ID:
			setId((Integer) newValue);
			return;
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__CONDITION_TO_ENFORCE:
			setConditionToEnforce((String) newValue);
			return;
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__TRACEABLE_TO:
			getTraceableTo().clear();
			getTraceableTo().addAll((Collection<? extends SystemLevelHazard>) newValue);
			return;
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__SYSTEM:
			setSystem((tau.systemengineering.STPAsec.System) newValue);
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
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__ID:
			setId(ID_EDEFAULT);
			return;
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__CONDITION_TO_ENFORCE:
			setConditionToEnforce(CONDITION_TO_ENFORCE_EDEFAULT);
			return;
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__TRACEABLE_TO:
			getTraceableTo().clear();
			return;
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__SYSTEM:
			setSystem((tau.systemengineering.STPAsec.System) null);
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
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__ID:
			return id != ID_EDEFAULT;
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__CONDITION_TO_ENFORCE:
			return CONDITION_TO_ENFORCE_EDEFAULT == null ? conditionToEnforce != null
					: !CONDITION_TO_ENFORCE_EDEFAULT.equals(conditionToEnforce);
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__TRACEABLE_TO:
			return traceableTo != null && !traceableTo.isEmpty();
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT__SYSTEM:
			return system != null;
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
		result.append(", conditionToEnforce: ");
		result.append(conditionToEnforce);
		result.append(')');
		return result.toString();
	}

} //SystemLevelConstraintImpl
