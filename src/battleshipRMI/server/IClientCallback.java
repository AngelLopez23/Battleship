package battleshipRMI.server;

import battleshipRMI.shared.model.game.AttackReport;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IClientCallback extends Remote {
    void notifyShotResult(AttackReport report) throws RemoteException;
    void notifyAdminLog(String message) throws RemoteException;
    void notifyTurnStart() throws RemoteException;
    void notifyGameEnd(String winner) throws RemoteException;
}
