/**
 */
package tau.systemengineering.STPAsec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import tau.systemengineering.STPAsec.Hazard;
import tau.systemengineering.STPAsec.LossScenario;
import tau.systemengineering.STPAsec.STPAsecPackage;
import tau.systemengineering.STPAsec.UnsafeControlAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hazard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.HazardImpl#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.HazardImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.HazardImpl#getRelatedLosses <em>Related Losses</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.HazardImpl#getUnsafeControlAction <em>Unsafe Control Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HazardImpl extends MinimalEObjectImpl.Container implements Hazard {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedLosses() <em>Related Losses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedLosses()
	 * @generated
	 * @ordered
	 */
	protected EList<LossScenario> relatedLosses;

	/**
	 * The cached value of the '{@link #getUnsafeControlAction() <em>Unsafe Control Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsafeControlAction()
	 * @generated
	 * @ordered
	 */
	protected EList<UnsafeControlAction> unsafeControlAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.HAZARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.HAZARD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.HAZARD__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LossScenario> getRelatedLosses() {
		if (relatedLosses == null) {
			relatedLosses = new EObjectResolvingEList<LossScenario>(LossScenario.class, this,
					STPAsecPackage.HAZARD__RELATED_LOSSES);
		}
		return relatedLosses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnsafeControlAction> getUnsafeControlAction() {
		if (unsafeControlAction == null) {
			unsafeControlAction = new EObjectResolvingEList<UnsafeControlAction>(UnsafeControlAction.class, this,
					STPAsecPackage.HAZARD__UNSAFE_CONTROL_ACTION);
		}
		return unsafeControlAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case STPAsecPackage.HAZARD__ID:
			return getId();
		case STPAsecPackage.HAZARD__DESCRIPTION:
			return getDescription();
		case STPAsecPackage.HAZARD__RELATED_LOSSES:
			return getRelatedLosses();
		case STPAsecPackage.HAZARD__UNSAFE_CONTROL_ACTION:
			return getUnsafeControlAction();
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
		case STPAsecPackage.HAZARD__ID:
			setId((Integer) newValue);
			return;
		case STPAsecPackage.HAZARD__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case STPAsecPackage.HAZARD__RELATED_LOSSES:
			getRelatedLosses().clear();
			getRelatedLosses().addAll((Collection<? extends LossScenario>) newValue);
			return;
		case STPAsecPackage.HAZARD__UNSAFE_CONTROL_ACTION:
			getUnsafeControlAction().clear();
			getUnsafeControlAction().addAll((Collection<? extends UnsafeControlAction>) newValue);
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
		case STPAsecPackage.HAZARD__ID:
			setId(ID_EDEFAULT);
			return;
		case STPAsecPackage.HAZARD__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case STPAsecPackage.HAZARD__RELATED_LOSSES:
			getRelatedLosses().clear();
			return;
		case STPAsecPackage.HAZARD__UNSAFE_CONTROL_ACTION:
			getUnsafeControlAction().clear();
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
		case STPAsecPackage.HAZARD__ID:
			return id != ID_EDEFAULT;
		case STPAsecPackage.HAZARD__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case STPAsecPackage.HAZARD__RELATED_LOSSES:
			return relatedLosses != null && !relatedLosses.isEmpty();
		case STPAsecPackage.HAZARD__UNSAFE_CONTROL_ACTION:
			return unsafeControlAction != null && !unsafeControlAction.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //HazardImpl
