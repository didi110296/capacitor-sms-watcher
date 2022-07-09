export interface SmsWatcherPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
