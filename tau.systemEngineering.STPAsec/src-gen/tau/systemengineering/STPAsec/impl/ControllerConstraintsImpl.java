/**
 */
package tau.systemengineering.STPAsec.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tau.systemengineering.STPAsec.ControllerConstraints;
import tau.systemengineering.STPAsec.InsecureControlAction;
import tau.systemengineering.STPAsec.STPAsecPackage;
import tau.systemengineering.STPAsec.SystemLevelHazard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControllerConstraintsImpl#getICA <em>ICA</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControllerConstraintsImpl#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControllerConstraintsImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControllerConstraintsImpl#getSystemlevelhazard <em>Systemlevelhazard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerConstraintsImpl extends MinimalEObjectImpl.Container implements ControllerConstraints {
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
	 * The default value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected String constraints = CONSTRAINTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSystemlevelhazard() <em>Systemlevelhazard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemlevelhazard()
	 * @generated
	 * @ordered
	 */
	protected SystemLevelHazard systemlevelhazard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.CONTROLLER_CONSTRAINTS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.CONTROLLER_CONSTRAINTS__ICA, oldICA, ica));
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
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.CONTROLLER_CONSTRAINTS__ICA, oldICA,
					ica));
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
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.CONTROLLER_CONSTRAINTS__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(String newConstraints) {
		String oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.CONTROLLER_CONSTRAINTS__CONSTRAINTS,
					oldConstraints, constraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemLevelHazard getSystemlevelhazard() {
		if (systemlevelhazard != null && systemlevelhazard.eIsProxy()) {
			InternalEObject oldSystemlevelhazard = (InternalEObject) systemlevelhazard;
			systemlevelhazard = (SystemLevelHazard) eResolveProxy(oldSystemlevelhazard);
			if (systemlevelhazard != oldSystemlevelhazard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.CONTROLLER_CONSTRAINTS__SYSTEMLEVELHAZARD, oldSystemlevelhazard,
							systemlevelhazard));
			}
		}
		return systemlevelhazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemLevelHazard basicGetSystemlevelhazard() {
		return systemlevelhazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemlevelhazard(SystemLevelHazard newSystemlevelhazard) {
		SystemLevelHazard oldSystemlevelhazard = systemlevelhazard;
		systemlevelhazard = newSystemlevelhazard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.CONTROLLER_CONSTRAINTS__SYSTEMLEVELHAZARD, oldSystemlevelhazard, systemlevelhazard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case STPAsecPackage.CONTROLLER_CONSTRAINTS__ICA:
			if (resolve)
				return getICA();
			return basicGetICA();
		case STPAsecPackage.CONTROLLER_CONSTRAINTS__ID:
			return getId();
		case STPAsecPackage.CONTROLLER_CONSTRAINTS__CONSTRAINTS:
			return getConstraints();
		case STPAsecPackage.CONTROLLER_CONSTRAINTS__SYSTEMLEVELHAZARD:
			if (resolve)
				return getSystemlevelhazard();
			return basicGetSystemlevelhazard();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case STPAsecPackage.CONTROLLER_CONSTRAINTS__ICA:
			setICA((InsecureControlAction) newValue);
			return;
		case STPAsecPackage.CONTROLLER_CONSTRAINTS__ID:
			setId((Integer) newValue);
			return;
		case STPAsecPackage.CONTROLLER_CONSTRAINTS__CONSTRAINTS:
			setConstraints((String) newValue);
			return;
		case STPAsecPackage.CONTROLLER_CONSTRAINTS__SYSTEMLEVELHAZARD:
			setSystemlevelhazard((SystemLevelHazard) newValue);
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
		case STPAsecPackage.CONTROLLER_CONSTRAINTS__ICA:
			setICA((InsecureControlAction) null);
			return;
		case STPAsecPackage.CONTROLLER_CONSTRAINTS__ID:
			setId(ID_EDEFAULT);
			return;
		case STPAsecPackage.CONTROLLER_CONSTRAINTS__CONSTRAINTS:
			setConstraints(CONSTRAINTS_EDEFAULT);
			return;
		case STPAsecPackage.CONTROLLER_CONSTRAINTS__SYSTEMLEVELHAZARD:
			setSystemlevelhazard((SystemLevelHazard) null);
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
		case STPAsecPackage.CONTROLLER_CONSTRAINTS__ICA:
			return ica != null;
		case STPAsecPackage.CONTROLLER_CONSTRAINTS__ID:
			return id != ID_EDEFAULT;
		case STPAsecPackage.CONTROLLER_CONSTRAINTS__CONSTRAINTS:
			return CONSTRAINTS_EDEFAULT == null ? constraints != null : !CONSTRAINTS_EDEFAULT.equals(constraints);
		case STPAsecPackage.CONTROLLER_CONSTRAINTS__SYSTEMLEVELHAZARD:
			return systemlevelhazard != null;
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
		result.append(", constraints: ");
		result.append(constraints);
		result.append(')');
		return result.toString();
	}

} //ControllerConstraintsImpl
